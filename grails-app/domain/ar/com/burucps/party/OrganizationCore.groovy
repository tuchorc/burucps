package ar.com.burucps.party

import java.util.Map;

import ar.com.burucps.business.EmployeeRole;

class OrganizationCore extends Organization {

	static hasMany = [roles:OrganizationRole];

	static constraints = {
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
	
	def afterUpdate() {
		roles.each {
			it.uid = this.uid
			it.name = this.name
			it.email = this.email
			it.save()
		}
	}
	
	@Override
	public void addRole(String roleToAdd) {
		OrganizationRoleTrader organizationSingle = OrganizationRoleTrader.getInstance();
		OrganizationRole newRole = organizationSingle.create(roleToAdd);
		this.addToRoles(newRole);
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
