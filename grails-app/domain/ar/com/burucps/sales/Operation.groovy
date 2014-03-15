package ar.com.burucps.sales

public class Operation {

	String operationCode;
	String meaning;
	String description;

	static constraints = {
		operationCode (unique: true, blank: false)
		meaning (blank: false)
		description (nullable: true)
	}
}
