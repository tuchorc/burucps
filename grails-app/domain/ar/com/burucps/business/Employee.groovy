package ar.com.burucps.business

import ar.com.burucps.party.PersonRole

// TODO debe ser abstract
// abstract class Employee extends PersonRole {
class Employee extends PersonRole {

	static constraints = {
	}

	static mapping = { tablePerHierarchy false }

//	abstract void addRole(String roleToAdd);
//	abstract Boolean hasRole(String roleToAdd);
	
	void addRole(String roleToAdd){};
	Boolean hasRole(String roleToAdd){};
}
