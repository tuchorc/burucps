package ar.com.burucps.business

import ar.com.burucps.business.Employee;

// TODO debe ser abstract
// abstract class EmployeeRole extends Employee {
class EmployeeRole extends Employee {

	static belongsTo = [employee:EmployeeCore];
	
    static constraints = {
    }
	
	static mapping = { tablePerHierarchy false }
	
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
