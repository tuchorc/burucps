package ar.com.burucps.business.create

import ar.com.burucps.business.EmployeeRole
import ar.com.burucps.lib.create.ProductTrader

// Singleton
class EmployeeRoleTrader extends ProductTrader<EmployeeRole, String> {

	private static EmployeeRoleTrader INSTANCE = new EmployeeRoleTrader()

	private EmployeeRoleTrader() {}

	static EmployeeRoleTrader getInstance() {
		return INSTANCE
	}
}