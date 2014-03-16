<%@ page import="ar.com.burucps.party.OrganizationCore" %>



<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'organizationId', 'error')} ">
	<label for="organizationId">
		<g:message code="organizationCore.organizationId.label" default="Organization Id" />
		
	</label>
	<g:textField name="organizationId" value="${organizationCoreInstance?.organizationId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'organizationName', 'error')} ">
	<label for="organizationName">
		<g:message code="organizationCore.organizationName.label" default="Organization Name" />
		
	</label>
	<g:textField name="organizationName" value="${organizationCoreInstance?.organizationName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="organizationCore.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${organizationCoreInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'creationDate', 'error')} ">
	<label for="creationDate">
		<g:message code="organizationCore.creationDate.label" default="Creation Date" />
		
	</label>
	<g:datePicker name="creationDate" precision="day"  value="${organizationCoreInstance?.creationDate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'createdBy', 'error')} ">
	<label for="createdBy">
		<g:message code="organizationCore.createdBy.label" default="Created By" />
		
	</label>
	<g:textField name="createdBy" value="${organizationCoreInstance?.createdBy}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'lastUpdateDate', 'error')} ">
	<label for="lastUpdateDate">
		<g:message code="organizationCore.lastUpdateDate.label" default="Last Update Date" />
		
	</label>
	<g:datePicker name="lastUpdateDate" precision="day"  value="${organizationCoreInstance?.lastUpdateDate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'lastUpdateBy', 'error')} ">
	<label for="lastUpdateBy">
		<g:message code="organizationCore.lastUpdateBy.label" default="Last Update By" />
		
	</label>
	<g:textField name="lastUpdateBy" value="${organizationCoreInstance?.lastUpdateBy}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'roles', 'error')} ">
	<label for="roles">
		<g:message code="organizationCore.roles.label" default="Roles" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${organizationCoreInstance?.roles?}" var="r">
    <li><g:link controller="abstractOrganizationRole" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="abstractOrganizationRole" action="create" params="['organizationCore.id': organizationCoreInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'abstractOrganizationRole.label', default: 'AbstractOrganizationRole')])}</g:link>
</li>
</ul>


</div>

