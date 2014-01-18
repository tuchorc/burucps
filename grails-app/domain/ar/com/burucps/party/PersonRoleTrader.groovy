package ar.com.burucps.party

import ar.com.burucps.library.create.ProductTrader;

class PersonRoleTrader extends ProductTrader<PersonRole, String> {

    static constraints = {
    }
	
	private static PersonRoleTrader INSTANCE = new PersonRoleTrader();
	
		// El constructor privado no permite que se genere un constructor por defecto.
		// (con mismo modificador de acceso que la definición de la clase)
		private PersonRoleTrader() {}
	
		public static PersonRoleTrader getInstance() {
			return INSTANCE;
		}
}
