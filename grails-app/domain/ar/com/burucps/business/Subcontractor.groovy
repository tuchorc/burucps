package ar.com.burucps.business

import java.util.Date;

import org.aspectj.bridge.ICommand;

import ar.com.burucps.party.OrganizationCore
import ar.com.burucps.party.OrganizationRole
import ar.com.burucps.sales.ISalesRepresentative
import ar.com.burucps.sales.ISummarizable;
import ar.com.burucps.sales.Transaction;
import ar.com.burucps.settlement.ICommissionable;

class Subcontractor extends OrganizationRole implements ISummarizable, ISalesRepresentative, ICommissionable  {

	static final SPECIFICATION = "SUBCONTRACTOR";
	static hasMany = [transactions:Transaction]
	static belongsTo = [businessUnit : BusinessUnit]
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		businessUnit (nullable:false)
		// Auditoria
		creationDate (nullable: true);
		createdBy (nullable: true);
		lastUpdateDate (nullable: true);
		lastUpdateBy (nullable: true);
	}

	static mapping = { tablePerHierarchy false }

	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername()
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		creationDate = new Date();
		lastUpdateDate = new Date();
	}

	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		lastUpdateDate = new Date();
	}

	public String getSpecification() {
		return SPECIFICATION;
	}
}
