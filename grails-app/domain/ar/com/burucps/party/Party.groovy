package ar.com.burucps.party

//TODO: debe ser abstract
//abstract class Party {
class Party {

	String uid;
	String name;
	String email;

	static constraints = {
		uid (blank: false)
		name (blank: false)
		email (blank:true,email : true)
	}
}
