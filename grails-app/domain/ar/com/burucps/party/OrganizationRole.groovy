package ar.com.burucps.party

abstract class OrganizationRole extends Organization {
	static belongsTo = [organization : OrganizationCore]
	
	static constraints = {
		organization (nullable: false, blank : false)
	}
	
	@Override
	public Organization addRole(String roleSpec) {
		return organization.addRole(roleSpec);
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		return organization.hasRole(roleSpec);
	}

	@Override
	public void removeRole(String roleSpec) {
		organization.removeRole(roleSpec);
	}

	@Override
	public Organization getRole(String roleSpec) {
		return organization.getRole(roleSpec);
	}

	@Override
	public String getName() {
		return organization.getName();
	}

	@Override
	public String getUid() {
		return organization.getUid();
	}

	@Override
	public String getEmail() {
		return organization.getEmail();
	}
}
