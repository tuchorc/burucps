package ar.com.burucps.business

import ar.com.burucps.party.Person;
import ar.com.burucps.party.PersonRole

// TODO debe ser abstract
// abstract class Employee extends PersonRole {
class Employee extends PersonRole {
	
	static constraints = {
	}

	static mapping = { tablePerHierarchy false }

	//	Todo abstract
	Long getEmployeeNumber(){}
	void setEmployeeNumber(Long employeeNumber){}
	Employee addRole(String roleSpec){}
	Boolean hasRole(String roleSpec){}
	void removeRole(String roleSpec){}
	Employee getRole(String roleSpec){}
}
