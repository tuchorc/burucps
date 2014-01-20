package ar.com.burucps.sales

class Transaction {
	static belongsTo = [salesRepresentative: ISalesRepresentative, operation:Operation]
	Integer month
	Integer quantity

    static constraints = {
    }
}
