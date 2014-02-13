package ar.com.burucps.business.create

import ar.com.burucps.business.Coordinator
import ar.com.burucps.lib.create.ProductCreator

class CoordinatorCreator extends ProductCreator<Coordinator, String> {
	
	CoordinatorCreator  (String specification) {
		super (specification)
	}

	@Override
	public Coordinator create() {
		new Coordinator()
	}
}