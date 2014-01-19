package ar.com.burucps.party

import ar.com.burucps.library.create.Specificable;

abstract class PersonRole extends Person implements Specificable<String> {
	
	static belongsTo = [person:PersonCore];

    static constraints = {
    }
	
	abstract String getSpecification();
	
	@Override
	public void addRole(String roleToAdd) {
		person.addRole(roleToAdd);
		
	}

	@Override
	public Boolean hasRole(String roleToAdd) {
		return person.hasRole(roleToAdd);
	}
}
