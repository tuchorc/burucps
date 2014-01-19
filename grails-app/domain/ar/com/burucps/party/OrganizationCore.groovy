package ar.com.burucps.party

import java.util.Map;

import ar.com.burucps.business.EmployeeRole;

class OrganizationCore extends Organization {

	static hasMany = [roles:OrganizationRole];

	static constraints = {
	}

	@Override
	public void addRole(String roleToAdd) {
		OrganizationRoleTrader organizationSingle = OrganizationRoleTrader.getInstance();
		OrganizationRole newRole = organizationSingle.create(roleToAdd);
		roles.add(newRole);
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
