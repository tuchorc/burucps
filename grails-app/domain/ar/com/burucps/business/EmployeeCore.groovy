package ar.com.burucps.business

import java.util.List;

class EmployeeCore  extends Employee{
	
	String legajo;
	Map <String, EmployeeRole> roles;

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
}
