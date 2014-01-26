package ar.com.burucps.party

import ar.com.burucps.library.create.Specificable;

//TODO: debe ser abstract
//abstract class PersonRole extends Person implements Specificable<String> {
class PersonRole extends Person implements Specificable<String> {

	static belongsTo = [person:PersonCore];

	static constraints = {
		person (nullable:false, blank:false)
	}

	static mapping = { tablePerHierarchy false }

	//abstract String getSpecification();
	String getSpecification(){};

	@Override
	public void addRole(String roleToAdd) {
		person.addRole(roleToAdd);
	}

	@Override
	public Boolean hasRole(String roleToAdd) {
		return person.hasRole(roleToAdd);
	}

	def beforeInsert() {
		uid = person.uid
		name = person.name
		email = person.email
	}
}
