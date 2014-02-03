package ar.com.burucps.party

class OrganizationCore extends Organization {
	String uid;
	String name;
	String email;
	static hasMany = [roles:OrganizationRole];
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		uid (nullable: true)
		name (nullable: false)
		email (email : true, nullable: true)
		// Auditoria
		creationDate (nullable: true);
		createdBy (nullable: true);
		lastUpdateDate (nullable: true);
		lastUpdateBy (nullable: true);
	}
	
	def beforeInsert() {
		//createdBy = securityService.currentAuthenticatedUsername()
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		creationDate = new Date();
		lastUpdateDate = new Date();
	}

	def beforeUpdate() {
		//lastUpdatedBy = securityService.currentAuthenticatedUsername()
		lastUpdateDate = new Date();
	}


	@Override
	public Organization addRole(String roleSpec) {
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
	public Organization getRole(String roleSpec) {
		// TODO Auto-generated method stub
		return null;
	}	
}
