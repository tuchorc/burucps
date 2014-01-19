package ar.com.burucps.party

import java.util.Map;

class PersonCore extends Person {

	String firstName;
	String middleNames;
	String surname;
	Date birth;
	static hasMany = [roles:PersonRole];

	def validateNotEmpty = {
		if (!it) ['entryMissing']
	}

	static constraints = {
		firstName (validator: validateNotEmpty(it))
		surname (validator: validateNotEmpty(it))
		birth (max : new Date())
	}

	public String getFullName() {
		return [
			firstName,
			middleNames,
			surname
		].join(' ');
	}

	@Override
	public void addRole(String roleToAdd) {
		PersonRoleTrader personSingle = PersonRoleTrader.getInstance();
		PersonRole newRole = personSingle.create(roleToAdd);
		roles.add(newRole);
	}

	@Override
	public Boolean hasRole(String roleToLook) {
		roles.each {
			if (it.specification == roleToLook)
				return true;
		}
		return false;
	}
}
