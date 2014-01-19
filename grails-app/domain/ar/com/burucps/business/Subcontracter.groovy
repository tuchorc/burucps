package ar.com.burucps.business

import org.aspectj.bridge.ICommand;

import ar.com.burucps.party.OrganizationRole
import ar.com.burucps.sales.ISalesRepresentative
import ar.com.burucps.sales.ISummarizable;
import ar.com.burucps.settlement.ICommissionable;


class Subcontracter extends OrganizationRole implements ISummarizable, ISalesRepresentative, ICommissionable  {
	
	static final SPECIFICATION = "SUBCONTRACTER";

    static constraints = {
    }

	@Override
	public String getSpecification() {
		return SPECIFICATION;
	}
}
