package ar.com.burucps.party.create

import ar.com.burucps.lib.create.ProductTrader
import ar.com.burucps.party.OrganizationRole

// Singleton
class OrganizationRoleTrader extends ProductTrader<OrganizationRole, String> {

	private static OrganizationRoleTrader INSTANCE = new OrganizationRoleTrader()

	private OrganizationRoleTrader() {
	}

	static OrganizationRoleTrader getInstance() {
		INSTANCE
	}
}
