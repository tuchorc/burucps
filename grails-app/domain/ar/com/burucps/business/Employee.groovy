package ar.com.burucps.business

import ar.com.burucps.party.PersonRole

abstract class Employee extends PersonRole {

    static constraints = {
    }
	
	abstract void addRole(String roleToAdd);
	abstract Boolean hasRole(String roleToAdd);
}
