package ar.com.burucps.sales

import ar.com.burucps.business.Seller;

class SellerSummary extends AbstractSummary {

    // Seller
	Seller seller;

	static constraints = { seller (nullable:true) }
}
