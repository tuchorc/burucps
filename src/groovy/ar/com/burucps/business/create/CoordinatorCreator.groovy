package ar.com.burucps.business.create

import ar.com.burucps.business.Coordinator
import ar.com.burucps.lib.create.ProductCreator

class CoordinatorCreator extends ProductCreator<Coordinator, String> {

	@Override
	public Coordinator create() {
		new Coordinator()
	}
}