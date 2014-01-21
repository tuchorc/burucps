package ar.com.burucps.business

import ar.com.burucps.party.Party
import ar.com.burucps.sales.ISalesRepresentative;
import ar.com.burucps.sales.ISummarizable;

class Group implements ISummarizable  {

	// TODO era ISalesRepresentative
	static hasMany = [salesRepresentatives : Party]
	static belongsTo = [coordinator : Coordinator, parent : Group]

	static constraints = {
	}
}
