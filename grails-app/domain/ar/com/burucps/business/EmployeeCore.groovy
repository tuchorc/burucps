package ar.com.burucps.business

import java.util.List;

import ar.com.burucps.party.Organization;

class EmployeeCore  extends Employee {

	static final SPECIFICATION = "EMPLOYEE";

	String legajo;
	static hasMany = [roles:EmployeeRole];

	static constraints = {
	}

	static mapping = { tablePerHierarchy false }

	Employee addRole(String roleSpec) {
		def employeeSingle = EmployeeRoleTrader.getInstance();
		def newRole = employeeSingle.create(roleSpec);
		newRole.employee = this;
		roles.put(roleSpec, newRole);
		return newRole
	}

	Boolean hasRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec)
				return true;
		}
		return false;
	}
	
	void removeRole(String roleSpec){
		roles.each {
			if (it.specification == roleSpec) {
				roles.remove(it);
				return;
			}
		}
	}

	Employee getRole(String roleSpec){
		roles.each {
			if (it.specification == roleSpec)
				return it;
		}
		return null;
	}

	public String getSpecification() {
		return SPECIFICATION;
	}
}
