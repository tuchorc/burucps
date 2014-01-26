package ar.com.burucps.business

import ar.com.burucps.sales.ISummarizable;
import ar.com.burucps.settlement.ICommissionable;

class Coordinator implements ISummarizable, ICommissionable {
	// TODO: ver si minima unidad de coordinacion es pto de venta
	//static hasMany = [groupsAssigend : Group, sellers:Seller]
	static hasMany = [businessUnitsToCoordinate : BusinessUnit]
	
	static final SPECIFICATION = "COORDINATOR";

    static constraints = {
    }
	
	static mapping = { tablePerHierarchy false }
	
	@Override
	public String getSpecification() {
		return SPECIFICATION;
	}
}
