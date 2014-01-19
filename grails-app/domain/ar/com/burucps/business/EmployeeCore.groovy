package ar.com.burucps.business

import java.util.List;

class EmployeeCore  extends Employee {
	
	static final SPECIFICATION = "EMPLOYEE";
	
	String legajo;
	static hasMany = [roles:EmployeeRole];

	static constraints = {
	}
	
	@Override
	public void addRole(String roleToAdd) {
		 EmployeeRoleTrader employeeSingle = EmployeeRoleTrader.getInstance();
		 EmployeeRole newRole = employeeSingle.create(roleToAdd);
		 newRole.employee = this;
		 roles.put(roleToAdd, newRole);
	}
	
	@Override
	public Boolean hasRole(String roleToLook) {
		return roles.containsKey(roleToLook);
	}

	@Override
	public String getSpecification() {
		return SPECIFICATION;
	}
}
