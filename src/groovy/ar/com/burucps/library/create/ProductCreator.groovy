package ar.com.burucps.library.create

abstract class ProductCreator<Product, Specification> {
	
	Specification specification;

    static constraints = {
    }
	
	ProductCreator(Specification specification) {
		this.specification = specification;
	}
	
	Specification getSpecification() {
		return specification;
	}
	
	abstract Product create();
}
