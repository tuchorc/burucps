package ar.com.burucps.business

import ar.com.burucps.party.AbstractParty

public class BusinessUnit {
	String unitCode;
	String unitName;
	static belongsTo = [parent: BusinessUnit]
	Coordinator coordinator;
	// sales representatives must implement ISalesRepresentative
	Set<AbstractParty> salesRepresentatives;
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		unitCode (unique: true, blank: false, nullable: false)
		unitName (unique: true, blank: false, nullable: false)
		parent (nullable: true)
		//coordinator (blank: false, nullable: true)
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

	public void addSubcontractor(Subcontractor subcontractor) {
		addToSalesRepresentatives(subcontractor);
	}

	public void addSeller(Seller seller) {
		addToSalesRepresentatives(seller);
	}

	public Coordinator getCoordinator() {
		return coordinator ?: parent?.getCoordinator();
	}
	
	public String toString() {
		return "$unitName";
	}

}
