package ar.com.burucps.party

abstract class Party {

	String uid;
	String name;
	String email;

	static constraints = {
		uid (blank: false)
		name (blank: false)
		email (email : true)
	}
}
