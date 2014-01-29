package ar.com.burucps.party

import java.util.Date;
import java.util.Map;

class PersonCore extends Person {

	String uid;
	String email;
	String firstName;
	String middleNames;
	String surname;
	Date dateOfBirth;
	static hasMany = [roles : PersonRole];
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		uid (nullable: true)
		email (email : true, nullable: true)
		firstName (nullable: true)
		middleNames (nullable: true)
		surname (blank: false, nullable: true)
		dateOfBirth (max : new Date(), nullable: true)
		// Auditoria
		creationDate (nullable: true);
		createdBy (nullable: true);
		lastUpdateDate (nullable: true);
		lastUpdateBy (nullable: true);
	}

	static mapping = { tablePerHierarchy false }

	def beforeValidate() {
	}

	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername()
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		creationDate = new Date();
		lastUpdateDate = new Date();
	}

	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		lastUpdateDate = new Date();
	}

	public String getName() {
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

	Person addRole(String roleSpec) {
		PersonRoleTrader personSingle = PersonRoleTrader.getInstance();
		PersonRole newRole = personSingle.create(roleSpec);
		addToRoles(newRole);
		return newRole
	}

	Boolean hasRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec)
				return true;
		}
		return false;
	}

	void removeRole(String roleSpec){
		roles.each {
			if (it.specification == roleSpec) {
				roles.remove(it);
				return;
			}
		}
	}

	Person getRole(String roleSpec){
		roles.each {
			if (it.specification == roleSpec)
				return it;
		}
		return null;
	}

	String toString() {
		"$name";
	}
}
