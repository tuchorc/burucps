package ar.com.burucps.sales

import ar.com.burucps.business.Coordinator;

public class CoordinatorSummary extends AbstractSummary {

	// Coordinator
	Coordinator coordinator;

	static constraints = { coordinator (nullable:true) }
}
