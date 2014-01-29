package ar.com.burucps.party

import java.util.Date;
import java.util.Map;

import ar.com.burucps.business.EmployeeRole;

class OrganizationCore extends Organization {

	String uid;
	String name;
	String email;
	static hasMany = [roles:OrganizationRole];
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		uid (nullable: true)
		name (nullable: false)
		email (email : true, nullable: true)
		// Auditoria
		creationDate (nullable: true);
		createdBy (nullable: true);
		lastUpdateDate (nullable: true);
		lastUpdateBy (nullable: true);
	}

	static mapping = { tablePerHierarchy false }

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

	Organization addRole(String roleSpec) {
		OrganizationRoleTrader organizationSingle = OrganizationRoleTrader.getInstance();
		OrganizationRole newRole = organizationSingle.create(roleSpec);
		this.addToRoles(newRole);
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

	Organization getRole(String roleSpec){
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
