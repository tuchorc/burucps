package ar.com.burucps.business

import ar.com.burucps.business.Employee;

class EmployeeRole extends Employee {

	static belongsTo = [employee:EmployeeCore];
	
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
	
	@Override
	public String getSpecification() {
		return employee.SPECIFICATION;
	}
}
