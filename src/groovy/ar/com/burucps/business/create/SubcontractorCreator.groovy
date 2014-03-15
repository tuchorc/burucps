package ar.com.burucps.business.create

import ar.com.burucps.business.Subcontractor
import ar.com.burucps.lib.create.ProductCreator

class SubcontractorCreator extends ProductCreator<Subcontractor,String>{
	
	SubcontractorCreator(String specification) {
		super(specification)
	}

	@Override
	Subcontractor create() {
		new Subcontractor()
	}
}
