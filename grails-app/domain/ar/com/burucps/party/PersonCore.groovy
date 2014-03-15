package ar.com.burucps.party

import java.util.Date;

import ar.com.burucps.party.create.PersonRoleTrader

public class PersonCore extends AbstractPerson {
	String personId;
	String email;
	String firstName;
	String middleNames;
	String surname;
	Date dateOfBirth;
	static hasMany = [roles : AbstractPersonRole];
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		personId (nullable: true)
		email (email : true, nullable: true)
		firstName (blank: false, nullable: true)
		middleNames (nullable: true)
		surname (blank: false, nullable: true)
		dateOfBirth (max : new Date(), nullable: true)
		// Auditoria
		creationDate (nullable: true)
		createdBy (nullable: true)
		lastUpdateDate (nullable: true)
		lastUpdateBy (nullable: true)
	}

	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername();
		//lastUpdatedBy = securityService.currentAuthenticatedUsername();
		creationDate = new Date();
		lastUpdateDate = new Date();
	}

	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername();
		lastUpdateDate = new Date();
	}

	// Methods from AbstractParty
	@Override
	public String getPartyName() {
		def list = []
		if (firstName && firstName.trim())
			list << firstName;
		if (middleNames && middleNames.trim())
			list << surname;
		if (surname && surname.trim())
			list << surname;
		if (list.size() > 0)
			return list.join(' ');
		return null;
	}

	@Override
	public String getPartyUid() {
		return personId;
	}

	@Override
	public String getPartyEmail() {
		return email;
	}

	// Methods from AbstractPerson
	@Override
	public String getPersonFirstName() {
		return firstName;
	}

	@Override
	public String getPersonMiddleNames() {
		return middleNames;
	}

	@Override
	public String getPersonSurname() {
		return surname;
	}

	@Override
	public Date getPersonDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public AbstractPerson addRole(String roleSpec) {
		PersonRoleTrader personSingle = PersonRoleTrader.getInstance();
		AbstractPersonRole newRole = personSingle.create(roleSpec);
		if (newRole) {
			newRole.person = this;
			addToRoles(newRole);
		}
		return newRole;
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec)
				return true;
		}
		return false;
	}

	@Override
	public void removeRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec) {
				roles.remove(it);
				return;
			}
		}
	}

	@Override
	public AbstractPerson getRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec)
				return it;
		}
		return null;
	}

}