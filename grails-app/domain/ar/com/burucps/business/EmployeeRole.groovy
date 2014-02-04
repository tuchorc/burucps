package ar.com.burucps.business

abstract class EmployeeRole extends Employee {
	static belongsTo = [employee:EmployeeCore];
	
	static constraints = {
		employee (nullable:false, blank:false)
	}
	
	@Override
	public Long getEmployeeNumber() {
		employee.employeeNumber
	}

	@Override
	public Employee addRole(String roleSpec) {
		employee.addRole(roleSpec)
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		employee.hasRole(roleSpec)
	}

	@Override
	public void removeRole(String roleSpec) {
		employee.removeRole(roleSpec)
	}

	@Override
	public Employee getRole(String roleSpec) {
		employee.getRole(roleSpec)
	}
	
}
