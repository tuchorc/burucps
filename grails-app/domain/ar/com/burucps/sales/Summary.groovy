package ar.com.burucps.sales

abstract class Summary {
	// Operation
	Operation operation
	// Transaction
	Integer quantity
	Integer month

    static constraints = {
		month (blank: false, min: 1, max: 12)
		quantity (blank: false, min: 0)
    }
}
