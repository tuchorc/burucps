package ar.com.burucps.business

import ar.com.burucps.library.create.ProductCreator;


class CoordinatorCreator extends ProductCreator<Coordinator, String> {

    static constraints = {
    }

	@Override
	public Coordinator create() {
		return new Coordinator();
	}
	
}
