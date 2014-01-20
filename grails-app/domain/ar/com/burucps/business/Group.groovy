package ar.com.burucps.business

import ar.com.burucps.sales.ISalesRepresentative;
import ar.com.burucps.sales.ISummarizable;

class Group implements ISummarizable  {

	static hasMany = [salesRepresentatives : Seller]
	static belongsTo = [coordinator : Coordinator, parent : Group]

	static constraints = {
	}
}
