package ar.com.burucps.business

import ar.com.burucps.business.create.EmployeeRoleTrader
import ar.com.burucps.party.PersonCore

class EmployeeCore extends Employee {
	static final specification = "EMPLOYEE";
	PersonCore person;
	Long employeeNumber;
	static hasMany = [roles:EmployeeRole];
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		employeeNumber (unique:true, blank : false, nullable : false, min : 1L)
		// Auditoria
		creationDate (nullable: true);
		createdBy (nullable: true);
		lastUpdateDate (nullable: true);
		lastUpdateBy (nullable: true);
	}

	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername()
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		creationDate = new Date()
		lastUpdateDate = new Date()
	}

	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		lastUpdateDate = new Date()
	}


	@Override
	public Employee addRole(String roleSpec) {
		EmployeeRoleTrader employeeSingle = EmployeeRoleTrader.getInstance()
		EmployeeRole newRole = employeeSingle.create(roleSpec)
		if (newRole) {
			newRole.employee = this
			addToRoles(newRole)
		}
		return newRole
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec)
				return true
		}
		return false
	}

	@Override
	public void removeRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec) {
				roles.remove(it)
				return
			}
		}
	}

	@Override
	public Employee getRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec)
				return it
		}
		return null;
	}
}
