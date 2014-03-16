<%@ page import="ar.com.burucps.party.PersonCore" %>



<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'personId', 'error')} ">
	<label for="personId">
		<g:message code="personCore.personId.label" default="Person Id" />
		
	</label>
	<g:textField name="personId" value="${personCoreInstance?.personId}"/>

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

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'middleNames', 'error')} ">
	<label for="middleNames">
		<g:message code="personCore.middleNames.label" default="Middle Names" />
		
	</label>
	<g:textField name="middleNames" value="${personCoreInstance?.middleNames}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'surname', 'error')} ">
	<label for="surname">
		<g:message code="personCore.surname.label" default="Surname" />
		
	</label>
	<g:textField name="surname" value="${personCoreInstance?.surname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'dateOfBirth', 'error')} ">
	<label for="dateOfBirth">
		<g:message code="personCore.dateOfBirth.label" default="Date Of Birth" />
		
	</label>
	<g:datePicker name="dateOfBirth" precision="day"  value="${personCoreInstance?.dateOfBirth}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'creationDate', 'error')} ">
	<label for="creationDate">
		<g:message code="personCore.creationDate.label" default="Creation Date" />
		
	</label>
	<g:datePicker name="creationDate" precision="day"  value="${personCoreInstance?.creationDate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'createdBy', 'error')} ">
	<label for="createdBy">
		<g:message code="personCore.createdBy.label" default="Created By" />
		
	</label>
	<g:textField name="createdBy" value="${personCoreInstance?.createdBy}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'lastUpdateDate', 'error')} ">
	<label for="lastUpdateDate">
		<g:message code="personCore.lastUpdateDate.label" default="Last Update Date" />
		
	</label>
	<g:datePicker name="lastUpdateDate" precision="day"  value="${personCoreInstance?.lastUpdateDate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'lastUpdateBy', 'error')} ">
	<label for="lastUpdateBy">
		<g:message code="personCore.lastUpdateBy.label" default="Last Update By" />
		
	</label>
	<g:textField name="lastUpdateBy" value="${personCoreInstance?.lastUpdateBy}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'roles', 'error')} ">
	<label for="roles">
		<g:message code="personCore.roles.label" default="Roles" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${personCoreInstance?.roles?}" var="r">
    <li><g:link controller="abstractPersonRole" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="abstractPersonRole" action="create" params="['personCore.id': personCoreInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'abstractPersonRole.label', default: 'AbstractPersonRole')])}</g:link>
</li>
</ul>


</div>

