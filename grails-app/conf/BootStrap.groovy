import ar.com.burucps.business.Coordinator;
import ar.com.burucps.business.EmployeeCore;
import ar.com.burucps.business.Seller;
import ar.com.burucps.business.Subcontractor;

import ar.com.burucps.business.create.CoordinatorCreator;
import ar.com.burucps.business.create.EmployeeCreator;
import ar.com.burucps.business.create.EmployeeRoleTrader;
import ar.com.burucps.business.create.SellerCreator;
import ar.com.burucps.business.create.SubcontractorCreator;

import ar.com.burucps.party.create.OrganizationRoleTrader;
import ar.com.burucps.party.create.PersonRoleTrader;

class BootStrap {

	def init = { servletContext ->
		OrganizationRoleTrader organizationRoleTrader = OrganizationRoleTrader.getInstance()
		organizationRoleTrader.addCreator(Subcontractor.getSpecification(), new SubcontractorCreator(Subcontractor.getSpecification()))
		PersonRoleTrader personRoleTrader = PersonRoleTrader.getInstance()
		personRoleTrader.addCreator(EmployeeCore.getSpecification(), new EmployeeCreator(EmployeeCore.getSpecification()))
		EmployeeRoleTrader employeeRoleTrader = EmployeeRoleTrader.getInstance()
		employeeRoleTrader.addCreator(Coordinator.getSpecification(), new CoordinatorCreator(Coordinator.getSpecification()))
		employeeRoleTrader.addCreator(Seller.getSpecification(), new SellerCreator(Seller.getSpecification()))
	}
	
	def destroy = {
	}
}
