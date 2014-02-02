package ar.com.burucps.business

import ar.com.burucps.party.Organization;
import ar.com.burucps.party.OrganizationCore
import ar.com.burucps.party.OrganizationRole

class Subcontractor extends OrganizationRole {
	static final SPECIFICATION = "SUBCONTRACTOR";
	OrganizationCore organization
	
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		//businessUnit (nullable:false)
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

	public String getSpecification() {
		return SPECIFICATION;
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

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}