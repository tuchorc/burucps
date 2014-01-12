package ar.com.burucps.party

abstract class PersonRole extends Person{
	
	PersonCore person;

    static constraints = {
    }
	
	@Override
	public String getUid() {
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
