
<%@ page import="ar.com.burucps.business.EmployeeCore" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employeeCore.label', default: 'EmployeeCore')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-employeeCore" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-employeeCore" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list employeeCore">
			
				<g:if test="${employeeCoreInstance?.uid}">
				<li class="fieldcontain">
					<span id="uid-label" class="property-label"><g:message code="employeeCore.uid.label" default="Uid" /></span>
					
						<span class="property-value" aria-labelledby="uid-label"><g:fieldValue bean="${employeeCoreInstance}" field="uid"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeCoreInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="employeeCore.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${employeeCoreInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeCoreInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="employeeCore.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${employeeCoreInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeCoreInstance?.creationDate}">
				<li class="fieldcontain">
					<span id="creationDate-label" class="property-label"><g:message code="employeeCore.creationDate.label" default="Creation Date" /></span>
					
						<span class="property-value" aria-labelledby="creationDate-label"><g:formatDate date="${employeeCoreInstance?.creationDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeCoreInstance?.createdBy}">
				<li class="fieldcontain">
					<span id="createdBy-label" class="property-label"><g:message code="employeeCore.createdBy.label" default="Created By" /></span>
					
						<span class="property-value" aria-labelledby="createdBy-label"><g:fieldValue bean="${employeeCoreInstance}" field="createdBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeCoreInstance?.lastUpdateDate}">
				<li class="fieldcontain">
					<span id="lastUpdateDate-label" class="property-label"><g:message code="employeeCore.lastUpdateDate.label" default="Last Update Date" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdateDate-label"><g:formatDate date="${employeeCoreInstance?.lastUpdateDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeCoreInstance?.lastUpdateBy}">
				<li class="fieldcontain">
					<span id="lastUpdateBy-label" class="property-label"><g:message code="employeeCore.lastUpdateBy.label" default="Last Update By" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdateBy-label"><g:fieldValue bean="${employeeCoreInstance}" field="lastUpdateBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeCoreInstance?.person}">
				<li class="fieldcontain">
					<span id="person-label" class="property-label"><g:message code="employeeCore.person.label" default="Person" /></span>
					
						<span class="property-value" aria-labelledby="person-label"><g:link controller="personCore" action="show" id="${employeeCoreInstance?.person?.id}">${employeeCoreInstance?.person?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeCoreInstance?.legajo}">
				<li class="fieldcontain">
					<span id="legajo-label" class="property-label"><g:message code="employeeCore.legajo.label" default="Legajo" /></span>
					
						<span class="property-value" aria-labelledby="legajo-label"><g:fieldValue bean="${employeeCoreInstance}" field="legajo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeCoreInstance?.roles}">
				<li class="fieldcontain">
					<span id="roles-label" class="property-label"><g:message code="employeeCore.roles.label" default="Roles" /></span>
					
						<g:each in="${employeeCoreInstance.roles}" var="r">
						<span class="property-value" aria-labelledby="roles-label"><g:link controller="employeeRole" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:employeeCoreInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${employeeCoreInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
