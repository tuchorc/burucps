package ar.com.burucps.business

class Coordinator extends EmployeeRole {

		static final specification = "COORDINATOR";
	
	EmployeeCore employee
	Set<BusinessUnit> businessUnitsToCoordinate
	// Auiditoria
	Date creationDate
	String createdBy
	Date lastUpdateDate
	String lastUpdateBy

	static constraints = {
		// Auditoria
		creationDate (nullable: true)
		createdBy (nullable: true)
		lastUpdateDate (nullable: true)
		lastUpdateBy (nullable: true)
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
}
