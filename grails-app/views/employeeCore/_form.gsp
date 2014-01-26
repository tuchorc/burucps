<%@ page import="ar.com.burucps.business.EmployeeCore" %>



<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'uid', 'error')} ">
	<label for="uid">
		<g:message code="employeeCore.uid.label" default="Uid" />
		
	</label>
	<g:textField name="uid" value="${employeeCoreInstance?.uid}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="employeeCore.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${employeeCoreInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="employeeCore.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${employeeCoreInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'creationDate', 'error')} ">
	<label for="creationDate">
		<g:message code="employeeCore.creationDate.label" default="Creation Date" />
		
	</label>
	<g:datePicker name="creationDate" precision="day"  value="${employeeCoreInstance?.creationDate}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'createdBy', 'error')} ">
	<label for="createdBy">
		<g:message code="employeeCore.createdBy.label" default="Created By" />
		
	</label>
	<g:textField name="createdBy" value="${employeeCoreInstance?.createdBy}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'lastUpdateDate', 'error')} ">
	<label for="lastUpdateDate">
		<g:message code="employeeCore.lastUpdateDate.label" default="Last Update Date" />
		
	</label>
	<g:datePicker name="lastUpdateDate" precision="day"  value="${employeeCoreInstance?.lastUpdateDate}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'lastUpdateBy', 'error')} ">
	<label for="lastUpdateBy">
		<g:message code="employeeCore.lastUpdateBy.label" default="Last Update By" />
		
	</label>
	<g:textField name="lastUpdateBy" value="${employeeCoreInstance?.lastUpdateBy}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'person', 'error')} required">
	<label for="person">
		<g:message code="employeeCore.person.label" default="Person" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="person" name="person.id" from="${ar.com.burucps.party.PersonCore.list()}" optionKey="id" required="" value="${employeeCoreInstance?.person?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'legajo', 'error')} ">
	<label for="legajo">
		<g:message code="employeeCore.legajo.label" default="Legajo" />
		
	</label>
	<g:textField name="legajo" value="${employeeCoreInstance?.legajo}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeCoreInstance, field: 'roles', 'error')} ">
	<label for="roles">
		<g:message code="employeeCore.roles.label" default="Roles" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${employeeCoreInstance?.roles?}" var="r">
    <li><g:link controller="employeeRole" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="employeeRole" action="create" params="['employeeCore.id': employeeCoreInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'employeeRole.label', default: 'EmployeeRole')])}</g:link>
</li>
</ul>

</div>

