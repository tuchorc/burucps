package ar.com.burucps.party

import java.util.Map;

import ar.com.burucps.business.EmployeeRole;

class OrganizationCore extends Organization {
	
	String uid;
	String name;
	Map <String, OrganizationRole> roles;

    static constraints = {
    }
	
	@Override
	public String getUid() {
		return uid;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void addRole(String roleToAdd) {
		 OrganizationRoleTrader organizationSingle = OrganizationRoleTrader.getInstance();
		 OrganizationRole newRole = organizationSingle.create(roleToAdd);
		 newRole.organization = this;
		 roles.put(roleToAdd, newRole);
	}
	
	@Override
	public Boolean hasRole(String roleToLook) {
		return roles.containsKey(roleToLook);
	}
}
