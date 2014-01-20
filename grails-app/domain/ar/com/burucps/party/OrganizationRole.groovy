package ar.com.burucps.party

import ar.com.burucps.library.create.Specificable;

//TODO: debe ser abstract
//abstract class OrganizationRole extends Organization implements Specificable<String> {
class OrganizationRole extends Organization implements Specificable<String> {

	static belongsTo = [organization:OrganizationCore];
	

	static constraints = {
	}
	
	String getSpecification(){};
	//abstract String getSpecification();

	@Override
	public void addRole(String roleToAdd) {
		organization.addRole(roleToAdd);
	}

	@Override
	public Boolean hasRole(String roleToAdd) {
		return organization.hasRole(roleToAdd);
	}
}
