package ar.com.burucps.party

import ar.com.burucps.library.create.Specificable;

//TODO: debe ser abstract
//abstract class OrganizationRole extends Organization implements Specificable<String> {
class OrganizationRole extends Organization implements Specificable<String> {

	static belongsTo = [organization:OrganizationCore];

	static constraints = {
		organization (nullable: false, blank : false)
	}

	static mapping = { tablePerHierarchy false }

	//abstract String getSpecification();
	String getSpecification(){};

	Organization addRole(String roleToAdd) {
		return organization.addRole(roleToAdd);
	}

	Boolean hasRole(String roleToAdd) {
		return organization.hasRole(roleToAdd);
	}
	
	void removeRole(String roleSpec){
		organization.removeRole(roleSpec);
	}

	Organization getRole(String roleSpec){
		return organization.getRole(roleSpec)
	}

}
