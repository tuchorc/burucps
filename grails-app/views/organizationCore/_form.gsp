<%@ page import="ar.com.burucps.party.OrganizationCore"%>
<div
	class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'uid', 'error')} ">
	<label for="uid"> <g:message code="organizationCore.uid.label"
			default="Uid" />
	</label>
	<g:textField name="uid" value="${organizationCoreInstance?.uid}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'name', 'error')} ">
	<label for="name"> <g:message
			code="organizationCore.name.label" default="Name" />
	</label>
	<g:textField name="name" value="${organizationCoreInstance?.name}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'email', 'error')} ">
	<label for="email"> <g:message
			code="organizationCore.email.label" default="Email" />
	</label>
	<g:field type="email" name="email"
		value="${organizationCoreInstance?.email}" />
</div>
