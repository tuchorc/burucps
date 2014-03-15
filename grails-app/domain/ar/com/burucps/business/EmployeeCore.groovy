package ar.com.burucps.business

import ar.com.burucps.business.create.EmployeeRoleTrader
import ar.com.burucps.party.PersonCore

public class EmployeeCore extends AbstractEmployee {
	static final specification = "EMPLOYEE";
	Long employeeNumber;
	static hasMany = [roles:AbstractEmployeeRole];
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
	
	static mappedBy = [roles:'employee']

	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername();
		//lastUpdatedBy = securityService.currentAuthenticatedUsername();
		creationDate = new Date();
		lastUpdateDate = new Date();
	}

	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername();
		lastUpdateDate = new Date();
	}
	
	// Methods from AbstractEmployee
	@Override
	public Long getEmployeeEmployeeNumber() {
		return employeeNumber;
	}


	@Override
	public AbstractEmployee addRole(String roleSpec) {
		EmployeeRoleTrader employeeSingle = EmployeeRoleTrader.getInstance();
		AbstractEmployeeRole newRole = employeeSingle.create(roleSpec);
		if (newRole) {
			newRole.employee = this;
			addToRoles(newRole);
		}
		return newRole;
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec)
				return true;
		}
		return false;
	}

	@Override
	public void removeRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec) {
				roles.remove(it);
				return;
			}
		}
	}

	@Override
	public AbstractEmployee getRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec)
				return it;
		}
		return null;
	}
}
