package ar.com.burucps.sales

class Operation {

	String code
	String meaning
	String description

	static constraints = {
		code (unique: true, blank: false)
		meaning (blank: false)
		description (nullable: true)
	}
}
