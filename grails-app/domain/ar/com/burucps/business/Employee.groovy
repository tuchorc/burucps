package ar.com.burucps.business

import ar.com.burucps.party.PersonRole

abstract class Employee extends PersonRole {
	abstract Long getEmployeeNumber();
	abstract Employee addRole(String roleSpec);
	abstract Boolean hasRole(String roleSpec);
	abstract void removeRole(String roleSpec);
	abstract Employee getRole(String roleSpec);
}
