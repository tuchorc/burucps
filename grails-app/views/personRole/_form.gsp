<%@ page import="ar.com.burucps.party.PersonRole" %>



<div class="fieldcontain ${hasErrors(bean: personRoleInstance, field: 'uid', 'error')} required">
	<label for="uid">
		<g:message code="personRole.uid.label" default="Uid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="uid" required="" value="${personRoleInstance?.uid}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personRoleInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="personRole.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${personRoleInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personRoleInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="personRole.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${personRoleInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personRoleInstance, field: 'person', 'error')} required">
	<label for="person">
		<g:message code="personRole.person.label" default="Person" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="person" name="person.id" from="${ar.com.burucps.party.PersonCore.list()}" optionKey="id" required="" value="${personRoleInstance?.person?.id}" class="many-to-one"/>
</div>

