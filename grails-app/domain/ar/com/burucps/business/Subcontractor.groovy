package ar.com.burucps.business

import ar.com.burucps.party.AbstractOrganization;
import ar.com.burucps.party.OrganizationCore
import ar.com.burucps.party.AbstractOrganizationRole
import ar.com.burucps.sales.ISalesRepresentative;
import ar.com.burucps.sales.SalesTransaction;

public class Subcontractor extends AbstractOrganizationRole implements ISalesRepresentative {

	static final specification = "SUBCONTRACTOR";

	BusinessUnit businessUnit;
	static hasMany = [transactions:SalesTransaction]
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
		//createdBy = securityService.currentAuthenticatedUsername();
		//lastUpdatedBy = securityService.currentAuthenticatedUsername();
		creationDate = new Date();
		lastUpdateDate = new Date();
	}

	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername();
		lastUpdateDate = new Date();
	}

}