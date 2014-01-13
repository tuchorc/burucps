package ar.com.burucps.business

import ar.com.burucps.library.create.ProductCreator

class SubcontracterCreator extends ProductCreator<Subcontracter,String>{

    static constraints = {
    }

	@Override
	public Subcontracter create() {
		return new Subcontracter();
	}}
