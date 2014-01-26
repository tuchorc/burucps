package ar.com.burucps.business

import org.aspectj.bridge.ICommand;

import ar.com.burucps.party.OrganizationRole
import ar.com.burucps.sales.ISalesRepresentative
import ar.com.burucps.sales.ISummarizable;
import ar.com.burucps.sales.Transaction;
import ar.com.burucps.settlement.ICommissionable;


class Subcontractor extends OrganizationRole implements ISummarizable, ISalesRepresentative, ICommissionable  {
	
	static final SPECIFICATION = "SUBCONTRACTER";
	static hasMany = [transactions:Transaction]
	static belongsTo = [businessUnit : BusinessUnit]

    static constraints = {
    }
	
	static mapping = { tablePerHierarchy false }

	@Override
	public String getSpecification() {
		return SPECIFICATION;
	}
}
