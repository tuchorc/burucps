<%@ page import="ar.com.burucps.party.PersonCore" %>



<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'uid', 'error')} required">
	<label for="uid">
		<g:message code="personCore.uid.label" default="Uid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="uid" required="" value="${personCoreInstance?.uid}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="personCore.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${personCoreInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="personCore.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${personCoreInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="personCore.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${personCoreInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'surname', 'error')} ">
	<label for="surname">
		<g:message code="personCore.surname.label" default="Surname" />
		
	</label>
	<g:textField name="surname" value="${personCoreInstance?.surname}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'birth', 'error')} required">
	<label for="birth">
		<g:message code="personCore.birth.label" default="Birth" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="birth" precision="day"  value="${personCoreInstance?.birth}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'middleNames', 'error')} ">
	<label for="middleNames">
		<g:message code="personCore.middleNames.label" default="Middle Names" />
		
	</label>
	<g:textField name="middleNames" value="${personCoreInstance?.middleNames}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'roles', 'error')} ">
	<label for="roles">
		<g:message code="personCore.roles.label" default="Roles" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${personCoreInstance?.roles?}" var="r">
    <li><g:link controller="personRole" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="personRole" action="create" params="['personCore.id': personCoreInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'personRole.label', default: 'PersonRole')])}</g:link>
</li>
</ul>

</div>

