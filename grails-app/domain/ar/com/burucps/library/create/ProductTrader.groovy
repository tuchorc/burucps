package ar.com.burucps.library.create

abstract class ProductTrader<Product,Specification> {

	Map <Specification,ProductCreator<Product, Specification>> creators;

	static constraints = {
	}

	void addCreator(Specification specification, ProductCreator<Product, Specification> creator) {
		creators.put(specification,creator);
	}

	Product create(Specification specification) {
		ProductCreator creator = creators.get(specification);
		return creator.create();
	}
}
