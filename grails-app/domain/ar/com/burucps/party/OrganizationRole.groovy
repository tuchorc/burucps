package ar.com.burucps.party

abstract class OrganizationRole extends Organization {
	static belongsTo = [organization : OrganizationCore]
}
