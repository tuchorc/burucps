<%@ page import="ar.com.burucps.party.OrganizationCore"%>
<%@ page import="ar.com.burucps.business.Subcontractor"%>
<%@ page import="ar.com.burucps.business.BusinessUnit"%>
<div
	class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'organizationId', 'error')} ">
	<label for="organizationId"> <g:message
			code="organizationCore.organizationId.label"
			default="Organization Id" />
	</label>
	<g:textField name="organizationId"
		value="${organizationCoreInstance?.organizationId}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'organizationName', 'error')} ">
	<label for="organizationName"> <g:message
			code="organizationCore.organizationName.label"
			default="Organization Name" />
	</label>
	<g:textField name="organizationName"
		value="${organizationCoreInstance?.organizationName}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'email', 'error')} ">
	<label for="email"> <g:message
			code="organizationCore.email.label" default="Email" />
	</label>
	<g:field type="email" name="email"
		value="${organizationCoreInstance?.email}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'businessUnit', 'error')} required">
	<label for="businessUnit"> <g:message
			code="subcontractor.businessUnit.label" default="Business Unit" /> <span
		class="required-indicator">*</span>
	</label>
	<g:select id="businessUnit" name="businessUnit.id"
		from="${BusinessUnit.listGeographicalZones()}"
		optionKey="id" required="" class="many-to-one"
		value="${subcontractorInstance?.businessUnit?.id}" />
</div>
