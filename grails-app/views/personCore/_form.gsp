<%@ page import="ar.com.burucps.party.PersonCore"%>
<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'uid', 'error')} required">
	<label for="uid"> <g:message code="personCore.uid.label"
			default="Uid" /> <span class="required-indicator">*</span>
	</label>
	<g:textField name="uid" required="" value="${personCoreInstance?.uid}" />
</div>

<!-- div class="fieldcontain {hasErrors(bean: personCoreInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="personCore.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="{personCoreInstance?.name}"/>
</div-->

<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'firstName', 'error')} required">
	<label for="firstName"> <g:message
			code="personCore.firstName.label" default="First Name" /> <span
		class="required-indicator">*</span>

	</label>
	<g:textField name="firstName" required="" value="${personCoreInstance?.firstName}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'middleNames', 'error')} ">
	<label for="middleNames"> <g:message
			code="personCore.middleNames.label" default="Middle Names" />
	</label>
	<g:textField name="middleNames"
		value="${personCoreInstance?.middleNames}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'surname', 'error')} required">
	<label for="surname"> <g:message
			code="personCore.surname.label" default="Surname" /> <span
		class="required-indicator">*</span>
	</label>
	<g:textField name="surname" required="" value="${personCoreInstance?.surname}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'email', 'error')} ">
	<label for="email"> <g:message code="personCore.email.label"
			default="Email" />

	</label>
	<g:field type="email" name="email" value="${personCoreInstance?.email}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'birth', 'error')}">
	<label for="birth"> <g:message code="personCore.birth.label"
			default="Birth" /> <span class="required-indicator">*</span>
	</label>
	<g:datePicker name="birth" precision="day"
		value="${personCoreInstance?.birth}" />
</div>

