package ar.com.burucps.party

import java.util.Date;

//TODO: debe ser abstract
//abstract class Person  extends Party {
class Person  extends Party {

	static constraints = {
	}

	static mapping = { tablePerHierarchy false }

	//Todos Métodos abstractos
	String getFirstName(){}
	void setFirstName(String firstName){}
	String getMiddleNames(){}
	void setMiddleNames(String middleNames){}
	String getSurname(){}
	void setSurname(String surname){}
	Date getDateOfBirth(){}
	void setDateOfBirth(Date dateOfBirth){}
	Person addRole(String roleSpec){}
	Boolean hasRole(String roleSpec){}
	void removeRole(String roleSpec){}
	Person getRole(String roleSpec){}
}
