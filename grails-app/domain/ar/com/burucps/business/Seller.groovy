package ar.com.burucps.business

class Seller extends EmployeeRole {

	static final specification = "SELLER";

	EmployeeCore employee
	BusinessUnit businessUnit
	//static hasMany = [transactions:Transaction]
	// Auiditoria
	Date creationDate
	String createdBy
	Date lastUpdateDate
	String lastUpdateBy

	static constraints = {
		businessUnit(nullable:false, blank:false)
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
