package ar.com.burucps.party

abstract class PersonRole {
	
	PersonCore person;

    static constraints = {
    }
	
	@Override
	public Long getUid() {
		return person.uid;
	}

	@Override
	public String getName() {
		return person.name;
	}

	@Override
	public void addRole(String roleToAdd) {
		person.addRole(roleToAdd);
		
	}

	@Override
	public Boolean hasRole(String roleToAdd) {
		return person.hasRole(roleToAdd);
	}
}
