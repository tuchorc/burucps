package ar.com.burucps.party

import ar.com.burucps.party.create.OrganizationRoleTrader

public class OrganizationCore extends AbstractOrganization {
	String organizationId;
	String organizationName;
	String email;
	static hasMany = [roles:AbstractOrganizationRole];
	// Auiditoria
	Date creationDate;
	String createdBy;
	Date lastUpdateDate;
	String lastUpdateBy;

	static constraints = {
		organizationId (nullable: true)
		organizationName (nullable: false)
		email (email : true, nullable: true)
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
	
	@Override
	public String getPartyName() {
		return organizationName;
	}

	@Override
	public String getPartyUid() {
		return organizationId;
	}

	@Override
	public String getPartyEmail() {
		return email;
	}

	@Override
	public AbstractOrganization addRole(String roleSpec) {
		OrganizationRoleTrader organizationSingle = OrganizationRoleTrader.getInstance();
		AbstractOrganizationRole newRole = organizationSingle.create(roleSpec);
		if (newRole) {
			newRole.organization = this;
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
	public AbstractOrganization getRole(String roleSpec) {
		roles.each {
			if (it.specification == roleSpec)
				return it;
		}
		return null;
	}
}
