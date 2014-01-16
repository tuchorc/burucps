package ar.com.burucps.business

import ar.com.burucps.party.OrganizationRole
import ar.com.burucps.sales.ISalesRepresentative

class Subcontracter extends OrganizationRole{

    static constraints = {
    }
	
	@Override
	public void addRole(String roleToAdd) {
		organization.addRole(roleToAdd);
		
	}

	@Override
	public Boolean hasRole(String roleToAdd) {
		return organization.hasRole(roleToAdd);
	}
}
