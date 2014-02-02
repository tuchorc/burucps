package ar.com.burucps.party

abstract class Organization extends Party {
	abstract Organization addRole(String roleSpec);
	abstract Boolean hasRole(String roleSpec);
	abstract void removeRole(String roleSpec);
	abstract Organization getRole(String roleSpec);
}
