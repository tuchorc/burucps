package ar.com.burucps.business

import ar.com.burucps.sales.ISalesRepresentative;
import ar.com.burucps.sales.ISummarizable
import ar.com.burucps.sales.Transaction;
import ar.com.burucps.settlement.ICommissionable;

class Seller implements ISummarizable, ISalesRepresentative, ICommissionable {

	static final SPECIFICATION = "SELLER";
	// TODO: ver si hace falta referenciar al coordinador.
	//static belongsTo = [group : Group, coordinator : Coordinator]
	static belongsTo = [group : Branch]
	static hasMany = [transactions:Transaction]

	static constraints = {
	}

	@Override
	public String getSpecification() {
		return SPECIFICATION;
	}
}
