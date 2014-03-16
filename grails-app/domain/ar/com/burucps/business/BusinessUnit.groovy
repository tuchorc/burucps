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
		coordinator (nullable: true)
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

	/*
	 * If you override the equals(), you MUST also override hashCode().
	 * Otherwise a violation of the general contract for Object.hashCode will
	 * occur, which can have unexpected repercussions when your class is in
	 * conjunction with all hash-based collections.
	 */
	@Override
	public int hashCode() {
		return this.id.intValue();
	}

	@Override
	public boolean equals(Object o) {
		if (!o)
			return false;
		if (!o instanceof BusinessUnit)
			return false;
		if (!this.id)
			return false;
		return this.id.equals(((BusinessUnit) o).getId());
	}

	@Override
	public String toString() {
		return "$unitName";
	}

	public List<BusinessUnit> listAllButThis() {
		List<BusinessUnit> list = BusinessUnit.list();
		list.remove(this);
		return list;
	}

}
