package ar.com.burucps.party

//TODO: debe ser abstract
//abstract class Party {
class Party {
	static mapping = { tablePerHierarchy false }

	static constraints = {
	}

	String getName() {}
	String getUid() {}
	String getEmail() {}
}
