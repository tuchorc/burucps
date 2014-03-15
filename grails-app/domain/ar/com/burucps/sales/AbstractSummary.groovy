package ar.com.burucps.sales

public class AbstractSummary {
	// Operation
	Operation operation;
	// Transaction
	Integer quantity;
	Integer month;

    static constraints = {
		month (blank: false, min: 1, max: 12)
		quantity (blank: false, min: 0)
    }
}
