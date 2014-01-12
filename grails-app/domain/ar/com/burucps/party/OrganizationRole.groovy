package ar.com.burucps.party

class OrganizationRole extends Organization {
	
	OrganizationCore organization;

    static constraints = {
    }


	@Override
	public Long getUid() {
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
