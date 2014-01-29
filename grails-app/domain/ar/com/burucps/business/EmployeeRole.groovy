package ar.com.burucps.business

import ar.com.burucps.business.Employee;

// TODO debe ser abstract
// abstract class EmployeeRole extends Employee {
class EmployeeRole extends Employee {

	static belongsTo = [employee:EmployeeCore];

	static constraints = {
	}

	static mapping = { tablePerHierarchy false }

	Employee addRole(String roleToAdd) {
		return employee.addRole(roleToAdd);
	}

	Boolean hasRole(String roleToAdd) {
		return employee.hasRole(roleToAdd);
	}

	void removeRole(String roleToAdd) {
		employee.removeRole(roleToAdd);
	}

	Employee getRole(String roleToAdd) {
		return employee.getRole(roleToAdd);
	}

}
