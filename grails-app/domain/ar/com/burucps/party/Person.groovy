package ar.com.burucps.party

abstract class Person extends Party {
	abstract String getFirstName();
	abstract String getMiddleNames();
	abstract String getSurname();
	abstract Date getDateOfBirth();
	abstract Person addRole(String roleSpec);
	abstract Boolean hasRole(String roleSpec);
	abstract void removeRole(String roleSpec);
	abstract Person getRole(String roleSpec);
}
