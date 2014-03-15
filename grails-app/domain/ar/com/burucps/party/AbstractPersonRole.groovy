package ar.com.burucps.party

import java.util.Date;

public class AbstractPersonRole extends AbstractPerson {

	static belongsTo = [person:PersonCore];

	static constraints = {
		person (nullable:false, blank:false)
	}
	
	// Methods from AbstractParty
	@Override
	public String getPartyName() {
		return person.getPartyName();
	}

	@Override
	public String getPartyUid() {
		return person.getPartyUid();
	}

	@Override
	public String getPartyEmail() {
		return person.getPartyEmail();
	}
	
	// Methods from AbstractPerson
	@Override
	public String getPersonFirstName() {
		return person.getPersonFirstName();
	}

	@Override
	public String getPersonMiddleNames() {
		return person.getPersonMiddleNames();
	}

	@Override
	public String getPersonSurname() {
		return person.getPersonSurname();
	}

	@Override
	public Date getPersonDateOfBirth() {
		return person.getPersonDateOfBirth();
	}

	@Override
	public AbstractPerson addRole(String roleSpec) {
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
	public AbstractPerson getRole(String roleSpec) {
		return person.getRole(roleSpec);
	}

}
