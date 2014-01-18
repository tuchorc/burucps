package ar.com.burucps.business

import ar.com.burucps.library.create.ProductTrader

class EmployeeRoleTrader extends ProductTrader<EmployeeRole, String> {

	static constraints = {
	}

	private static EmployeeRoleTrader INSTANCE = new EmployeeRoleTrader();

	// El constructor privado no permite que se genere un constructor por defecto.
	// (con mismo modificador de acceso que la definición de la clase)
	private EmployeeRoleTrader() {}

	public static EmployeeRoleTrader getInstance() {
		return INSTANCE;
	}
}
