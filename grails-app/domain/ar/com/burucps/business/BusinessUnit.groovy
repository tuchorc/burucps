package ar.com.burucps.business

import ar.com.burucps.party.Party

class BusinessUnit {
	String code
	String name
	static belongsTo = [parent: BusinessUnit]
	Coordinator coordinator
	// sales representatives must implement ISalesRepresentative
	Set<Party> salesRepresentatives
	// Auiditoria
	Date creationDate
	String createdBy
	Date lastUpdateDate
	String lastUpdateBy

	static constraints = {
		code (unique: true, blank: false, nullable: false)
		name (unique: true, blank: false, nullable: false)
		parent (nullable: true)
		coordinator (blank: false, nullable: true)
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

	def addSubcontractor(Subcontractor subcontractor) {
		addToSalesRepresentatives(subcontractor)
	}

	def addSeller(Seller seller) {
		addToSalesRepresentatives(seller)
	}

	Coordinator getCoordinator() {
		coordinator ?: parent?.getCoordinator()
	}
	
	String toString() {
		"$name";
	}

}
