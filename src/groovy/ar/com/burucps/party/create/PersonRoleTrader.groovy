package ar.com.burucps.party.create

import ar.com.burucps.lib.create.ProductTrader
import ar.com.burucps.party.AbstractPersonRole

// Singleton
public class PersonRoleTrader extends ProductTrader<AbstractPersonRole, String> {

	private static PersonRoleTrader INSTANCE = new PersonRoleTrader()

	private PersonRoleTrader() {}

	public static PersonRoleTrader getInstance() {
		return INSTANCE;
	}
}
