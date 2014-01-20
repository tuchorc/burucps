<%@ page import="ar.com.burucps.party.Organization" %>



<div class="fieldcontain ${hasErrors(bean: organizationInstance, field: 'uid', 'error')} required">
	<label for="uid">
		<g:message code="organization.uid.label" default="Uid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="uid" required="" value="${organizationInstance?.uid}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: organizationInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="organization.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${organizationInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: organizationInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="organization.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${organizationInstance?.email}"/>
</div>

