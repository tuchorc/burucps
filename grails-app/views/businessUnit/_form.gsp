<%@ page import="ar.com.burucps.business.BusinessUnit"%>
<div
	class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'unitCode', 'error')} required">
	<label for="unitCode"> <g:message
			code="businessUnit.unitCode.label" default="Unit Code" /> <span
		class="required-indicator">*</span>
	</label>
	<g:textField name="unitCode" required="" autofocus=""
		value="${businessUnitInstance?.unitCode}" />
</div>

<div
	class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'unitName', 'error')} required">
	<label for="unitName"> <g:message
			code="businessUnit.unitName.label" default="Unit Name" /> <span
		class="required-indicator">*</span>
	</label>
	<g:textField name="unitName" required=""
		value="${businessUnitInstance?.unitName}" />
</div>

<g:if test="${ar.com.burucps.business.BusinessUnit.count() > 0}">
	<div
		class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'parent', 'error')} ">
		<label for="parent"> <g:message
				code="businessUnit.parent.label" default="Parent" />

		</label>
		<g:select id="parent" name="parent.id"
			from="${businessUnitInstance?.listAllButThis()}" optionKey="id"
			value="${businessUnitInstance?.parent?.id}" class="many-to-one"
			noSelection="['':'-']" />
	</div>
</g:if>

<g:if test="${ar.com.burucps.business.Coordinator.count() > 0}">
	<div
		class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'coordinator', 'error')}">
		<label for="coordinator"> <g:message
				code="businessUnit.coordinator.label" default="Coordinator" />
		</label>
		<g:select id="coordinator" name="coordinator.id"
			from="${ar.com.burucps.business.Coordinator.list()}" optionKey="id"
			value="${businessUnitInstance?.coordinator?.id}" class="many-to-one"
			noSelection="['':'-']" />
	</div>
</g:if>
