package ar.com.burucps.sales

import ar.com.burucps.business.BusinessUnit;

public class BusinessUnitSummary extends AbstractSummary {

	// Business Unit
	BusinessUnit businessUnit;

	static constraints = { businessUnit (nullable:true) }
}
