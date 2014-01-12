package ar.com.burucps.party

class PersonCore {
	
	String firstName;
	String middleNames;
	String surname;
	Date birth;
	Long id;
	String uid;
	List<PersonRole> roles;

    static constraints = {
    }
	
	@Override
	public String getUid() {
		return uid;
	}
	
	@Override
	public String getName() {
		return [firstName, middleNames,surname].join(' ');
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
