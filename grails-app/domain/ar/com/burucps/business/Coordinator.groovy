package ar.com.burucps.business

class Coordinator extends EmployeeRole {

	EmployeeCore employee
	// TODO: ver si minima unidad de coordinacion es pto de venta
	//static hasMany = [groupsAssigend : Group, sellers:Seller]
	//static hasMany = [businessUnitsToCoordinate : BusinessUnit]

	static final specification = "COORDINATOR";

	static constraints = {
	}
}
