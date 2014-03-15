package ar.com.burucps.sales

import ar.com.burucps.party.AbstractParty

public class SalesTransaction {
	Integer month;
	Integer quantity;
	// sales representative must implement ISalesRepresentative
	static belongsTo = [operation: Operation, salesRepresentative: AbstractParty]

	static constraints = {
		operation (blank: false)
		month (blank: false, min: 1, max: 12)
		quantity (blank: false, min: 1);
		salesRepresentative (blank: false)
	}

	void setSalesRepresentative (AbstractParty party) {
		if (party instanceof ISalesRepresentative)
			salesRepresentative = party
		else
			throw new Exception()
	}

}
