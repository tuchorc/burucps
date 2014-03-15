package ar.com.burucps.party.create

import ar.com.burucps.lib.create.ProductTrader
import ar.com.burucps.party.AbstractOrganizationRole

// Singleton
public class OrganizationRoleTrader extends ProductTrader<AbstractOrganizationRole, String> {

	private static OrganizationRoleTrader INSTANCE = new OrganizationRoleTrader()

	private OrganizationRoleTrader() {
	}

	public static OrganizationRoleTrader getInstance() {
		return INSTANCE;
	}
}
