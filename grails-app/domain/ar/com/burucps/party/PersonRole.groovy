package ar.com.burucps.party

import java.util.Date;

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

	String getFirstName(){
		return person.firstName
	}

	void setFirstName(String firstName){
		person.firstName = firstName
	}

	String getMiddleNames(){
		return person.middleNames
	}

	void setMiddleNames(String middleNames){
		person.middleNames = middleNames
	}

	String getSurname(){
		return person.surname
	}

	void setSurname(String surname){
		person.surname = surname
	}

	Date getDateOfBirth(){
		return person.dateOfBirth
	}

	void setDateOfBirth(Date dateOfBirth){
		person.dateOfBirth = dateOfBirth
	}

	Person addRole(String roleToAdd) {
		return person.addRole(roleToAdd);
	}

	Boolean hasRole(String roleToAdd) {
		return person.hasRole(roleToAdd);
	}

	void removeRole(String roleSpec){
		person.removeRole(roleSpec);
	}

	Person getRole(String roleSpec){
		return person.getRole(roleSpec)
	}

	def beforeInsert() {
	}
}
