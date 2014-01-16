package ar.com.burucps.business

import java.util.List;

class EmployeeCore  extends Employee{
	
	String legajo;
	List <EmployeeRole> roles;

	static constraints = {
	}
	
	@Override
	public void addRole(String roleToAdd) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public Boolean hasRole(String roleToAdd) {
		// TODO Auto-generated method stub
		
	}
}
