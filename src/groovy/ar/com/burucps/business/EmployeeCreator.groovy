package ar.com.burucps.business

import ar.com.burucps.library.create.ProductCreator;


class EmployeeCreator extends ProductCreator<Employee,String> {

    static constraints = {
    }

	@Override
	public Employee create() {
		return new EmployeeCore();
	}
	
	}
