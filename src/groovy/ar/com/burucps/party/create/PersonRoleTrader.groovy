package ar.com.burucps.party.create

import ar.com.burucps.lib.create.ProductTrader
import ar.com.burucps.party.PersonRole

// Singleton
class PersonRoleTrader extends ProductTrader<PersonRole, String> {

	private static PersonRoleTrader INSTANCE = new PersonRoleTrader()

	private PersonRoleTrader() {}

	static PersonRoleTrader getInstance() {
		INSTANCE
	}
}
