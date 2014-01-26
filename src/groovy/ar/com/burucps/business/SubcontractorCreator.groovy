package ar.com.burucps.business

import ar.com.burucps.library.create.ProductCreator

class SubcontractorCreator extends ProductCreator<Subcontractor,String>{

    static constraints = {
    }

	@Override
	public Subcontractor create() {
		return new Subcontractor();
	}}
