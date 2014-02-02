package ar.com.burucps.party

import java.util.Date;

class PersonRole extends Person {

	static belongsTo = [person:PersonCore];

	static constraints = {
		person (nullable:false, blank:false)
	}

	@Override
	public String getFirstName() {
		return person.getFirstName();
	}

	@Override
	public String getMiddleNames() {
		return person.getMiddleNames();
	}

	@Override
	public String getSurname() {
		return person.getSurname();
	}

	@Override
	public Date getDateOfBirth() {
		return person.getDateOfBirth();
	}

	@Override
	public Person addRole(String roleSpec) {
		return person.addRole(roleSpec);
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		return person.hasRole(roleSpec);
	}

	@Override
	public void removeRole(String roleSpec) {
		person.removeRole(roleSpec);
	}

	@Override
	public Person getRole(String roleSpec) {
		return person.getRole(roleSpec);
	}

	@Override
	public String getName() {
		return person.getName();
	}

	@Override
	public String getUid() {
		return person.getUid();
	}

	@Override
	public String getEmail() {
		return person.getEmail();
	}
}
