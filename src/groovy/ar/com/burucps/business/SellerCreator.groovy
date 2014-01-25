package ar.com.burucps.business

import ar.com.burucps.library.create.ProductCreator;


class SellerCreator extends ProductCreator<Seller,String> {

    static constraints = {
    }

	@Override
	public Seller create() {
		return new Seller();
	}}
