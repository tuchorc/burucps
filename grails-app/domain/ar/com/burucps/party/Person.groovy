package ar.com.burucps.party

//TODO: debe ser abstract
//abstract class Person  extends Party {
class Person  extends Party {

	static constraints = {
	}

	static mapping = { tablePerHierarchy false }

	//abstract void addRole(String roleToAdd);
	//abstract Boolean hasRole(String roleToAdd);
	void addRole(String roleToAdd){};
	Boolean hasRole(String roleToAdd){};
}
