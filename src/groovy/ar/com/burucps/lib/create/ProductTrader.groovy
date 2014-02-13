package ar.com.burucps.lib.create

abstract class ProductTrader<Product,Specification> {

	Map <Specification,ProductCreator<Product, Specification>> creators = [:]

	void addCreator(Specification specification, ProductCreator<Product, Specification> creator) {
		if ( specification && creator )
			creators.put(specification,creator);

		/*Can not add creator without specification or creator*/
		else throw new Exception( "Can't add Creator. Specification or creator is null." )
	}

	Product create(Specification specification) {
		ProductCreator creator;
		Product newProduct;
		creator = creators.get(specification);
		if ( creator ) {
			return creator.create();
		}
		
		/*Can not get creator, so can not create product*/
		throw new Exception( "Can't create Product. Creator is null." )
	}
}
