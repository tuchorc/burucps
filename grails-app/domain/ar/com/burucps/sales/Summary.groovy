package ar.com.burucps.sales

import ar.com.burucps.party.Party

class Summary {
	// TODO era ISummarizable
	static belongsTo = [entity:Party,operation:Operation]

    static constraints = {
    }
}
