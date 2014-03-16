package ar.com.burucps.party

public class AbstractOrganizationRole extends AbstractOrganization {

	static belongsTo = [organization : OrganizationCore]

	static constraints = {
		organization (nullable: false, blank : false)
	}

	@Override
	public AbstractOrganization addRole(String roleSpec) {
		return organization?.addRole(roleSpec);
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		return organization?.hasRole(roleSpec);
	}

	@Override
	public void removeRole(String roleSpec) {
		organization?.removeRole(roleSpec);
	}

	@Override
	public AbstractOrganization getRole(String roleSpec) {
		return organization?.getRole(roleSpec);
	}

	@Override
	public String getPartyName() {
		return organization?.getPartyName();
	}

	@Override
	public String getPartyUid() {
		return organization?.getPartyUid();
	}

	@Override
	public String getPartyEmail() {
		return organization?.getPartyEmail();
	}
}
