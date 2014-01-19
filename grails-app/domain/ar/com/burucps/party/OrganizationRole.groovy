package ar.com.burucps.party

import ar.com.burucps.library.create.Specificable;

abstract class OrganizationRole extends Organization implements Specificable<String> {

	static belongsTo = [organization:OrganizationCore];
	

	static constraints = {
	}
	
	abstract String getSpecification();

	@Override
	public void addRole(String roleToAdd) {
		organization.addRole(roleToAdd);
	}

	@Override
	public Boolean hasRole(String roleToAdd) {
		return organization.hasRole(roleToAdd);
	}
}
