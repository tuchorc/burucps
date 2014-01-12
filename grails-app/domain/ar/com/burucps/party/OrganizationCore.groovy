package ar.com.burucps.party

class OrganizationCore extends Organization {
	
	String uid;
	String name;
	List <OrganizationRole> roles;

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
		// TODO Auto-generated method stub
	}
	
	@Override
	public Boolean hasRole(String roleToAdd) {
		// TODO Auto-generated method stub
		
	}
}
