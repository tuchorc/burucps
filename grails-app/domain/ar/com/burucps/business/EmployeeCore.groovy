package ar.com.burucps.business

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeRole(String roleSpec) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getRole(String roleSpec) {
		// TODO Auto-generated method stub
		return null;
	}
}
