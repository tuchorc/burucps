package ar.com.burucps.party

abstract class OrganizationRole extends Organization {
	
	OrganizationCore organization;

    static constraints = {
    }


	@Override
	public String getUid() {
		return organization.uid;
	}

	@Override
	public String getName() {
		return organization.name;
	}

	@Override
	public void addRole(String roleToAdd) {
		organization.addRole(roleToAdd);
		
	}

	@Override
	public Boolean hasRole(String roleToAdd) {
		return organization.hasRole(roleToAdd);
	}
	
}
