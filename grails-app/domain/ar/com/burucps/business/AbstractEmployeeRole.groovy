package ar.com.burucps.business

public class AbstractEmployeeRole extends AbstractEmployee {
	static belongsTo = [employee:EmployeeCore];
	
	static constraints = {
		employee (nullable:false, blank:false)
	}
	
	@Override
	public Long getEmployeeEmployeeNumber() {
		employee?.getEmployeeEmployeeNumber();
	}

	@Override
	public AbstractEmployee addRole(String roleSpec) {
		employee?.addRole(roleSpec);
	}

	@Override
	public Boolean hasRole(String roleSpec) {
		employee?.hasRole(roleSpec);
	}

	@Override
	public void removeRole(String roleSpec) {
		employee?.removeRole(roleSpec);
	}

	@Override
	public AbstractEmployee getRole(String roleSpec) {
		employee?.getRole(roleSpec);
	}
	
}
