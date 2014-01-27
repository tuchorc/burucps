<%@ page import="ar.com.burucps.party.PersonCore"%>

<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'uid', 'error')} ">
	<label for="uid"> <g:message code="personCore.uid.label"
			default="Uid" />
	</label>
	<g:textField name="uid" value="${personCoreInstance?.uid}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'firstName', 'error')} ">
	<label for="firstName"> <g:message
			code="personCore.firstName.label" default="First Name" />
	</label>
	<g:textField name="firstName" value="${personCoreInstance?.firstName}" />
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
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'surname', 'error')} ">
	<label for="surname"> <g:message
			code="personCore.surname.label" default="Surname" />
	</label>
	<g:textField name="surname" value="${personCoreInstance?.surname}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'dateOfBirth', 'error')} ">
	<label for="dateOfBirth"> <g:message
			code="personCore.dateOfBirth.label" default="Date Of Birth" />
	</label>
	<g:datePicker name="dateOfBirth" precision="day"
		value="${personCoreInstance?.dateOfBirth}" default="none"
		noSelection="['': '']" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'email', 'error')} ">
	<label for="email"> <g:message code="personCore.email.label"
			default="Email" />
	</label>
	<g:field type="email" name="email" value="${personCoreInstance?.email}" />
</div>
