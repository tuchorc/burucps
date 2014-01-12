package ar.com.burucps.party

abstract class Party {

    static constraints = {
    }
	
	abstract Long getUid();
	abstract String getName();
	abstract void addRole(String roleToAdd);
	abstract Boolean hasRole(String roleToAdd);
}
