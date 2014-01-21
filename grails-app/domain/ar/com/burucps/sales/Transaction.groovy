package ar.com.burucps.sales

import ar.com.burucps.party.Party

class Transaction {
	// TODO era ISalesRepresentative
	static belongsTo = [salesRepresentative: Party, operation:Operation]
	Integer month
	Integer quantity

    static constraints = {
    }
}
