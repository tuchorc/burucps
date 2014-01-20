<%@ page import="ar.com.burucps.party.OrganizationRole" %>



<div class="fieldcontain ${hasErrors(bean: organizationRoleInstance, field: 'uid', 'error')} required">
	<label for="uid">
		<g:message code="organizationRole.uid.label" default="Uid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="uid" required="" value="${organizationRoleInstance?.uid}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: organizationRoleInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="organizationRole.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${organizationRoleInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: organizationRoleInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="organizationRole.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${organizationRoleInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: organizationRoleInstance, field: 'organization', 'error')} required">
	<label for="organization">
		<g:message code="organizationRole.organization.label" default="Organization" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="organization" name="organization.id" from="${ar.com.burucps.party.OrganizationCore.list()}" optionKey="id" required="" value="${organizationRoleInstance?.organization?.id}" class="many-to-one"/>
</div>

