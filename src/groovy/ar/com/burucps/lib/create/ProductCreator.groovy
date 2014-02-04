package ar.com.burucps.lib.create

abstract class ProductCreator<Product, Specification> {
	
	Specification specification

	ProductCreator(Specification specification) {
		this.specification = specification
	}
	
	abstract Product create();
}