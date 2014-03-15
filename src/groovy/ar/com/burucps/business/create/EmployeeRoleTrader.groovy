package ar.com.burucps.business.create

import ar.com.burucps.business.AbstractEmployeeRole
import ar.com.burucps.lib.create.ProductTrader

// Singleton
class EmployeeRoleTrader extends ProductTrader<AbstractEmployeeRole, String> {

	private static EmployeeRoleTrader INSTANCE = new EmployeeRoleTrader()

	private EmployeeRoleTrader() {}

	static EmployeeRoleTrader getInstance() {
		return INSTANCE
	}
}