
<%@ page import="ar.com.burucps.party.OrganizationCore" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'organizationCore.label', default: 'OrganizationCore')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-organizationCore" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-organizationCore" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list organizationCore">
			
				<g:if test="${organizationCoreInstance?.organizationId}">
				<li class="fieldcontain">
					<span id="organizationId-label" class="property-label"><g:message code="organizationCore.organizationId.label" default="Organization Id" /></span>
					
						<span class="property-value" aria-labelledby="organizationId-label"><g:fieldValue bean="${organizationCoreInstance}" field="organizationId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${organizationCoreInstance?.organizationName}">
				<li class="fieldcontain">
					<span id="organizationName-label" class="property-label"><g:message code="organizationCore.organizationName.label" default="Organization Name" /></span>
					
						<span class="property-value" aria-labelledby="organizationName-label"><g:fieldValue bean="${organizationCoreInstance}" field="organizationName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${organizationCoreInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="organizationCore.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${organizationCoreInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${organizationCoreInstance?.creationDate}">
				<li class="fieldcontain">
					<span id="creationDate-label" class="property-label"><g:message code="organizationCore.creationDate.label" default="Creation Date" /></span>
					
						<span class="property-value" aria-labelledby="creationDate-label"><g:formatDate date="${organizationCoreInstance?.creationDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${organizationCoreInstance?.createdBy}">
				<li class="fieldcontain">
					<span id="createdBy-label" class="property-label"><g:message code="organizationCore.createdBy.label" default="Created By" /></span>
					
						<span class="property-value" aria-labelledby="createdBy-label"><g:fieldValue bean="${organizationCoreInstance}" field="createdBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${organizationCoreInstance?.lastUpdateDate}">
				<li class="fieldcontain">
					<span id="lastUpdateDate-label" class="property-label"><g:message code="organizationCore.lastUpdateDate.label" default="Last Update Date" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdateDate-label"><g:formatDate date="${organizationCoreInstance?.lastUpdateDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${organizationCoreInstance?.lastUpdateBy}">
				<li class="fieldcontain">
					<span id="lastUpdateBy-label" class="property-label"><g:message code="organizationCore.lastUpdateBy.label" default="Last Update By" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdateBy-label"><g:fieldValue bean="${organizationCoreInstance}" field="lastUpdateBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${organizationCoreInstance?.roles}">
				<li class="fieldcontain">
					<span id="roles-label" class="property-label"><g:message code="organizationCore.roles.label" default="Roles" /></span>
					
						<g:each in="${organizationCoreInstance.roles}" var="r">
						<span class="property-value" aria-labelledby="roles-label"><g:link controller="abstractOrganizationRole" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:organizationCoreInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${organizationCoreInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
