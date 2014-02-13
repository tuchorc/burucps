<%@ page import="ar.com.burucps.business.Subcontractor"%>
<%@ page import="ar.com.burucps.party.OrganizationCore"%>

<div
	class="fieldcontain ${hasErrors(bean: organization, field: 'uid', 'error')} ">
	<label for="uid"> <g:message code="organizationCore.uid.label"
			default="Uid" />
	</label>
	<g:field type="text" autofocus="" name="organization.uid"
		value="${organization.uid}"
		placeholder="${message(code:'organizationCore.uid.placeholder', default:'')}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: organization, field: 'name', 'error')} ">
	<label for="name"> <g:message
			code="organizationCore.name.label" default="Name" /> <span
		class="required-indicator">*</span>

	</label>
	<g:field type="text" name="organization.name" value="${organization?.name}"
		required=""
		placeholder="${message(code:'organizationCore.name.placeholder', default:'')}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: organization, field: 'email', 'error')} ">
	<label for="email"> <g:message
			code="organizationCore.email.label" default="Email" />
	</label>
	<g:field type="email" name="organization.email" value="${organization?.email}"
		placeholder="${message(code:'organizationCore.email.placeholder', default:'')}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: subcontractor, field: 'businessUnit', 'error')} ">
	<label for="businessUnit"> <g:message
			code="subcontractor.businessUnit.label" default="BusinessUnit" />

	</label>
	<g:select id="businessUnit" name="subcontractor.businessUnit.id"
		from="${ar.com.burucps.business.BusinessUnit.list()}" optionKey="id"
		value="${subcontractor?.businessUnit?.id}" class="many-to-one"
		noSelection="${['null':message(code: 'default.noSelection.label', default: '- No selection -')]}" />
</div>