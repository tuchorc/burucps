<%@ page import="ar.com.burucps.business.BusinessUnit" %>



<div class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'unitCode', 'error')} required">
	<label for="unitCode">
		<g:message code="businessUnit.unitCode.label" default="Unit Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="unitCode" required="" value="${businessUnitInstance?.unitCode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'unitName', 'error')} required">
	<label for="unitName">
		<g:message code="businessUnit.unitName.label" default="Unit Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="unitName" required="" value="${businessUnitInstance?.unitName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'parent', 'error')} ">
	<label for="parent">
		<g:message code="businessUnit.parent.label" default="Parent" />
		
	</label>
	<g:select id="parent" name="parent.id" from="${ar.com.burucps.business.BusinessUnit.list()}" optionKey="id" value="${businessUnitInstance?.parent?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'creationDate', 'error')} ">
	<label for="creationDate">
		<g:message code="businessUnit.creationDate.label" default="Creation Date" />
		
	</label>
	<g:datePicker name="creationDate" precision="day"  value="${businessUnitInstance?.creationDate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'createdBy', 'error')} ">
	<label for="createdBy">
		<g:message code="businessUnit.createdBy.label" default="Created By" />
		
	</label>
	<g:textField name="createdBy" value="${businessUnitInstance?.createdBy}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'lastUpdateDate', 'error')} ">
	<label for="lastUpdateDate">
		<g:message code="businessUnit.lastUpdateDate.label" default="Last Update Date" />
		
	</label>
	<g:datePicker name="lastUpdateDate" precision="day"  value="${businessUnitInstance?.lastUpdateDate}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'lastUpdateBy', 'error')} ">
	<label for="lastUpdateBy">
		<g:message code="businessUnit.lastUpdateBy.label" default="Last Update By" />
		
	</label>
	<g:textField name="lastUpdateBy" value="${businessUnitInstance?.lastUpdateBy}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'coordinator', 'error')} required">
	<label for="coordinator">
		<g:message code="businessUnit.coordinator.label" default="Coordinator" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="coordinator" name="coordinator.id" from="${ar.com.burucps.business.Coordinator.list()}" optionKey="id" required="" value="${businessUnitInstance?.coordinator?.id}" class="many-to-one"/>

</div>

