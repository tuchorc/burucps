<%@ page import="ar.com.burucps.party.OrganizationCore" %>



<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'uid', 'error')} required">
	<label for="uid">
		<g:message code="organizationCore.uid.label" default="Uid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="uid" required="" value="${organizationCoreInstance?.uid}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="organizationCore.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${organizationCoreInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="organizationCore.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${organizationCoreInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'roles', 'error')} ">
	<label for="roles">
		<g:message code="organizationCore.roles.label" default="Roles" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${organizationCoreInstance?.roles?}" var="r">
    <li><g:link controller="organizationRole" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="organizationRole" action="create" params="['organizationCore.id': organizationCoreInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'organizationRole.label', default: 'OrganizationRole')])}</g:link>
</li>
</ul>

</div>

