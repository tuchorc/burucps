<%@ page import="ar.com.burucps.business.Coordinator" %>



<div class="fieldcontain ${hasErrors(bean: coordinatorInstance, field: 'businessUnitsToCoordinate', 'error')} ">
	<label for="businessUnitsToCoordinate">
		<g:message code="coordinator.businessUnitsToCoordinate.label" default="Business Units To Coordinate" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${coordinatorInstance?.businessUnitsToCoordinate?}" var="b">
    <li><g:link controller="businessUnit" action="show" id="${b.id}">${b?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="businessUnit" action="create" params="['coordinator.id': coordinatorInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'businessUnit.label', default: 'BusinessUnit')])}</g:link>
</li>
</ul>

</div>

