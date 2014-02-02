package ar.com.burucps.business

import ar.com.burucps.party.Organization;
import ar.com.burucps.party.OrganizationCore
import ar.com.burucps.party.OrganizationRole

class Subcontractor extends OrganizationRole {
	
	static final specification = "SUBCONTRACTOR";
	
	OrganizationCore organization
	BusinessUnit businessUnit
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		businessUnit (nullable:false)
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