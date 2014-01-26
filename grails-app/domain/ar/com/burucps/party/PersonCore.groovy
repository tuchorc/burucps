package ar.com.burucps.party

import java.util.Map;

class PersonCore extends Person {

	String firstName;
	String middleNames;
	String surname;
	Date birth;
	static hasMany = [roles:PersonRole];

	static constraints = {
		firstName (nullable: true)
		middleNames (nullable: true)
		surname (blank: false, nullable: true)
		birth (max : new Date(), nullable: true)
	}

	static mapping = { tablePerHierarchy false }
	
	def beforeValidate() {
		name = getFullName();
	}
	
	def beforeInsert() {
	 }
	
	def afterInsert() {
	}
	
	def beforeUpdate() {
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
		return [
			firstName,
			middleNames,
			surname
		].join(' ');
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
}
