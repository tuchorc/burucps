package ar.com.burucps.business.create

import ar.com.burucps.business.EmployeeCore
import ar.com.burucps.lib.create.ProductCreator

class EmployeeCreator extends ProductCreator<EmployeeCore,String> {

	@Override
	EmployeeCore create() {
		new EmployeeCore()
	}
}