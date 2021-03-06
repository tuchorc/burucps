package ar.com.burucps.business.create

import ar.com.burucps.business.Seller
import ar.com.burucps.lib.create.ProductCreator

class SellerCreator extends ProductCreator<Seller,String> {

	SellerCreator  (String specification) {
		super (specification)
	}

	@Override
	Seller create() {
		return new Seller()
	}
}
