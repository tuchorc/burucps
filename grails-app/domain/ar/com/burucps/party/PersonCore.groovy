package ar.com.burucps.party

import java.util.Map;

class PersonCore extends Person {

	String firstName;
	String middleNames;
	String surname;
	Date dateOfBirth;
	static hasMany = [roles:PersonRole];

	static constraints = {
		firstName (nullable: true)
		middleNames (nullable: true)
		surname (blank: false, nullable: true)
		dateOfBirth (max : new Date(), nullable: true)
	}

	static mapping = { tablePerHierarchy false }

	def beforeValidate() {
		name = getFullName();
	}

	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername()
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		creationDate = new Date();
		lastUpdateDate = new Date();
	}

	def afterInsert() {
	}

	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		lastUpdateDate = new Date();
	}

	def afterUpdate() {
		roles.each {
			it.uid = this.uid
			it.name = this.name
			it.email = this.email
			it.save()
		}
	}

	public String getFullName() {
		def list = []
		if (firstName && firstName.trim())
			list << firstName;
		if (middleNames && middleNames.trim())
			list << surname;
		if (surname && surname.trim())
			list << surname;
		if (list.size() > 0)
			return list.join(' ');
		return null;
	}

	@Override
	public void addRole(String roleToAdd) {
		PersonRoleTrader personSingle = PersonRoleTrader.getInstance();
		PersonRole newRole = personSingle.create(roleToAdd);
		addToRoles(newRole);
	}

	@Override
	public Boolean hasRole(String roleToLook) {
		roles.each {
			if (it.specification == roleToLook)
				return true;
		}
		return false;
	}
	
	String toString() {
		"$name";
	}
}
