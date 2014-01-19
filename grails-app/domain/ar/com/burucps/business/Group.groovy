package ar.com.burucps.business

import ar.com.burucps.sales.ISalesRepresentative;
import ar.com.burucps.sales.ISummarizable;

class Group implements ISummarizable  {

	static hasMany = [salesRepresentatives : ISalesRepresentative]
	static belongsTo = [coordinator : Coordinator, parent : Group]

	static constraints = {
	}
}
