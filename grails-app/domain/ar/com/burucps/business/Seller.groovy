package ar.com.burucps.business

class Seller extends EmployeeRole {
	
	EmployeeCore employee

    static final specification = "SELLER";
	// TODO: ver si hace falta referenciar al coordinador.
	//static belongsTo = [group : Group, coordinator : Coordinator]
	//static belongsTo = [businessUnit : BusinessUnit]
	//static hasMany = [transactions:Transaction]

	static constraints = {
//		businessUnit(nullable:false, blank:false)
	}

}
