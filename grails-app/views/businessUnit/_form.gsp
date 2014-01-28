<%@ page import="ar.com.burucps.business.BusinessUnit"%>
<div
	class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'code', 'error')} required">
	<label for="code"> <g:message code="businessUnit.code.label"
			default="Code" /> <span class="required-indicator">*</span>
	</label>
	<g:textField name="code" value="${businessUnitInstance?.code}"
		required="" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'name', 'error')} required">
	<label for="name"> <g:message code="businessUnit.name.label"
			default="Name" /> <span class="required-indicator">*</span>
	</label>
	<g:textField name="name" value="${businessUnitInstance?.name}"
		required="" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'coordinator', 'error')} ">
	<label for="coordinator"> <g:message
			code="businessUnit.coordinator.label" default="Coordinator" />
	</label>
	<g:select id="coordinator" name="coordinator.id"
		from="${ar.com.burucps.business.Coordinator.list()}" optionKey="id"
		value="${businessUnitInstance?.coordinator?.id}" class="many-to-one" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'parent', 'error')}">
	<label for="parent"> <g:message
			code="businessUnit.parent.label" default="Parent" />
	</label>
	<g:select id="parent" name="parent.id" noSelection="['':'-']"
		from="${ar.com.burucps.business.BusinessUnit.list()}" optionKey="id"
		value="${businessUnitInstance?.parent?.id}" class="many-to-one" />
</div>
