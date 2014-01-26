<%@ page import="ar.com.burucps.business.Subcontractor" %>



<div class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'uid', 'error')} ">
	<label for="uid">
		<g:message code="subcontractor.uid.label" default="Uid" />
		
	</label>
	<g:textField name="uid" value="${subcontractorInstance?.uid}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="subcontractor.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${subcontractorInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="subcontractor.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${subcontractorInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'creationDate', 'error')} ">
	<label for="creationDate">
		<g:message code="subcontractor.creationDate.label" default="Creation Date" />
		
	</label>
	<g:datePicker name="creationDate" precision="day"  value="${subcontractorInstance?.creationDate}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'createdBy', 'error')} ">
	<label for="createdBy">
		<g:message code="subcontractor.createdBy.label" default="Created By" />
		
	</label>
	<g:textField name="createdBy" value="${subcontractorInstance?.createdBy}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'lastUpdateDate', 'error')} ">
	<label for="lastUpdateDate">
		<g:message code="subcontractor.lastUpdateDate.label" default="Last Update Date" />
		
	</label>
	<g:datePicker name="lastUpdateDate" precision="day"  value="${subcontractorInstance?.lastUpdateDate}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'lastUpdateBy', 'error')} ">
	<label for="lastUpdateBy">
		<g:message code="subcontractor.lastUpdateBy.label" default="Last Update By" />
		
	</label>
	<g:textField name="lastUpdateBy" value="${subcontractorInstance?.lastUpdateBy}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'organization', 'error')} required">
	<label for="organization">
		<g:message code="subcontractor.organization.label" default="Organization" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="organization" name="organization.id" from="${ar.com.burucps.party.OrganizationCore.list()}" optionKey="id" required="" value="${subcontractorInstance?.organization?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: subcontractorInstance, field: 'transactions', 'error')} ">
	<label for="transactions">
		<g:message code="subcontractor.transactions.label" default="Transactions" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${subcontractorInstance?.transactions?}" var="t">
    <li><g:link controller="transaction" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="transaction" action="create" params="['subcontractor.id': subcontractorInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'transaction.label', default: 'Transaction')])}</g:link>
</li>
</ul>

</div>

