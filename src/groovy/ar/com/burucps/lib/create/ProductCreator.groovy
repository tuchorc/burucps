package ar.com.burucps.lib.create

public abstract class ProductCreator<Product, Specification> {
	
	private Specification specification

	public ProductCreator(Specification specification) {
		this.specification = specification
	}
	
	public abstract Product create();
}