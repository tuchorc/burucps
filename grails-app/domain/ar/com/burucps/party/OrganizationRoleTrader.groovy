package ar.com.burucps.party

import ar.com.burucps.business.EmployeeRoleTrader;
import ar.com.burucps.library.create.ProductTrader;

class OrganizationRoleTrader extends ProductTrader<OrganizationRole, String> {

	static constraints = {
	}
	
	private static OrganizationRoleTrader INSTANCE = new OrganizationRoleTrader();
	
		// El constructor privado no permite que se genere un constructor por defecto.
		// (con mismo modificador de acceso que la definición de la clase)
		private OrganizationRoleTrader() {}
	
		public static OrganizationRoleTrader getInstance() {
			return INSTANCE;
		}
}
