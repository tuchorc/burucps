package ar.com.burucps.sales

class Summary {
	static belongsTo = [entity:ISummarizable,operation:Operation]

    static constraints = {
    }
}
