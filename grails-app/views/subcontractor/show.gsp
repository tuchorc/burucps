
<%@ page import="ar.com.burucps.business.Subcontractor" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'subcontractor.label', default: 'Subcontractor')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-subcontractor" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-subcontractor" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list subcontractor">
			
				<g:if test="${subcontractor?.uid}">
				<li class="fieldcontain">
					<span id="uid-label" class="property-label"><g:message code="subcontractor.uid.label" default="Uid" /></span>
					
						<span class="property-value" aria-labelledby="uid-label"><g:fieldValue bean="${subcontractor}" field="uid"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${subcontractor?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="subcontractor.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${subcontractor}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${subcontractor?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="subcontractor.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${subcontractor}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${subcontractor?.creationDate}">
				<li class="fieldcontain">
					<span id="creationDate-label" class="property-label"><g:message code="subcontractor.creationDate.label" default="Creation Date" /></span>
					
						<span class="property-value" aria-labelledby="creationDate-label"><g:formatDate date="${subcontractor?.creationDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${subcontractor?.createdBy}">
				<li class="fieldcontain">
					<span id="createdBy-label" class="property-label"><g:message code="subcontractor.createdBy.label" default="Created By" /></span>
					
						<span class="property-value" aria-labelledby="createdBy-label"><g:fieldValue bean="${subcontractor}" field="createdBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${subcontractor?.lastUpdateDate}">
				<li class="fieldcontain">
					<span id="lastUpdateDate-label" class="property-label"><g:message code="subcontractor.lastUpdateDate.label" default="Last Update Date" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdateDate-label"><g:formatDate date="${subcontractor?.lastUpdateDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${subcontractor?.lastUpdateBy}">
				<li class="fieldcontain">
					<span id="lastUpdateBy-label" class="property-label"><g:message code="subcontractor.lastUpdateBy.label" default="Last Update By" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdateBy-label"><g:fieldValue bean="${subcontractor}" field="lastUpdateBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${subcontractor?.organization}">
				<li class="fieldcontain">
					<span id="organization-label" class="property-label"><g:message code="subcontractor.organization.label" default="Organization" /></span>
					
						<span class="property-value" aria-labelledby="organization-label"><g:link controller="organizationCore" action="show" id="${subcontractor?.organization?.id}">${subcontractor?.organization?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${subcontractor?.transactions}">
				<li class="fieldcontain">
					<span id="transactions-label" class="property-label"><g:message code="subcontractor.transactions.label" default="Transactions" /></span>
					
						<g:each in="${subcontractor.transactions}" var="t">
						<span class="property-value" aria-labelledby="transactions-label"><g:link controller="transaction" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:subcontractor, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${subcontractor}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
