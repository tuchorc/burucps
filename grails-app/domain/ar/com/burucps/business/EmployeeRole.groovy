package ar.com.burucps.business

import ar.com.burucps.business.Employee;

class EmployeeRole extends Employee{

	EmployeeCore employee;
	
    static constraints = {
    }
	
	@Override
	public void addRole(String roleToAdd) {
		employee.addRole(roleToAdd);
		
	}

	@Override
	public Boolean hasRole(String roleToAdd) {
		return employee.hasRole(roleToAdd);
	}
	
}
