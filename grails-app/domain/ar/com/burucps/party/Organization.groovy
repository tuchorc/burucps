package ar.com.burucps.party

abstract class Organization extends Party {

    static constraints = {
    }
	
	abstract void addRole(String roleToAdd);
	abstract Boolean hasRole(String roleToAdd);
}
