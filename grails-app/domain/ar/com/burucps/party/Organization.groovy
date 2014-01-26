package ar.com.burucps.party

//TODO: debe ser abstract
//abstract class Organization extends Party {
class Organization extends Party {

	static constraints = {
	}

	static mapping = { tablePerHierarchy false }

	//abstract void addRole(String roleToAdd);
	//abstract Boolean hasRole(String roleToAdd);
	void addRole(String roleToAdd){};
	Boolean hasRole(String roleToAdd){};
}
