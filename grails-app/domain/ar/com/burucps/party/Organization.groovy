package ar.com.burucps.party

//TODO: debe ser abstract
//abstract class Organization extends Party {
class Organization extends Party {

	static constraints = {
	}

	static mapping = { tablePerHierarchy false }

	//Todo abstract
	Organization addRole(String roleSpec){}
	Boolean hasRole(String roleSpec){}
	void removeRole(String roleSpec){}
	Organization getRole(String roleSpec){}
}
