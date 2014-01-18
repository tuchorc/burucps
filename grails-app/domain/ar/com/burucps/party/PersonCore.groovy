package ar.com.burucps.party

import java.util.Map;

class PersonCore extends Person {

	String firstName;
	String middleNames;
	String surname;
	Date birth;
	Long id;
	String uid;
	Map <String, PersonCore> roles;

	static constraints = {
	}

	@Override
	public String getUid() {
		return uid;
	}

	@Override
	public String getName() {
		return [
			firstName,
			middleNames,
			surname
		].join(' ');
	}

	@Override
	public void addRole(String roleToAdd) {
		OrganizationRoleTrader personSingle = PersonRoleTrader.getInstance();
		PersonRole newRole = personSingle.create(roleToAdd);
		newRole.person = this;
		roles.put(roleToAdd, newRole);
	}

	@Override
	public Boolean hasRole(String roleToLook) {
		return roles.containsKey(roleToLook);
	}
}
