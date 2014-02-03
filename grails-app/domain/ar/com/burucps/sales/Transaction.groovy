package ar.com.burucps.sales

import ar.com.burucps.party.Party

class Transaction {
	Integer month
	Integer quanityt
	// sales representative must implement ISalesRepresentative
	static belongsTo = [operation: Operation, salesRepresentative: Party]

	static constraints = {
		operation (blank: false)
		month (blank: false, min: 1, max: 12)
		salesRepresentative (blank: false)
	}

	void setSalesRepresentative (Party party) {
		if (party instanceof ISalesRepresentative)
			salesRepresentative = party
		else
			throw new Exception()
	}

}
