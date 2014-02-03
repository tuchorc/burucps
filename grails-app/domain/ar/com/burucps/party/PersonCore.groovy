package ar.com.burucps.party

class PersonCore extends Person {
	String uid;
	String email;
	String firstName;
	String middleNames;
	String surname;
	Date dateOfBirth;
	static hasMany = [roles : PersonRole];
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		uid (nullable: true)
		email (email : true, nullable: true)
		firstName (blank: false, nullable: true)
		middleNames (nullable: true)
		surname (blank: false, nullable: true)
		dateOfBirth (max : new Date(), nullable: true)
		// Auditoria
		creationDate (nullable: true);
		createdBy (nullable: true);
		lastUpdateDate (nullable: true);
		lastUpdateBy (nullable: true);
	}

	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername()
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		creationDate = new Date()
		lastUpdateDate = new Date()
	}

	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		lastUpdateDate = new Date()
	}


	@Override
	public Person addRole(String roleSpec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeRole(String roleSpec) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person getRole(String roleSpec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
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
}