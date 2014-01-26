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

	@Override
	public void addRole(String roleToAdd) {
		organization.addRole(roleToAdd);
	}

	@Override
	public Boolean hasRole(String roleToAdd) {
		return organization.hasRole(roleToAdd);
	}

	def beforeInsert() {
		uid = organization.uid
		name = organization.name
		email = organization.email
	}

}
