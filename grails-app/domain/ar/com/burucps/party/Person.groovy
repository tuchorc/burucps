package ar.com.burucps.party

abstract class Person  extends Party {

    static constraints = {
    }
	
	abstract String getUid();
	abstract String getName();
	abstract void addRole(String roleToAdd);
	abstract Boolean hasRole(String roleToAdd);
}
