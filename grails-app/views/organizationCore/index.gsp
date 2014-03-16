
<%@ page import="ar.com.burucps.party.OrganizationCore" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'organizationCore.label', default: 'OrganizationCore')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-organizationCore" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-organizationCore" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="organizationId" title="${message(code: 'organizationCore.organizationId.label', default: 'Organization Id')}" />
					
						<g:sortableColumn property="organizationName" title="${message(code: 'organizationCore.organizationName.label', default: 'Organization Name')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'organizationCore.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="creationDate" title="${message(code: 'organizationCore.creationDate.label', default: 'Creation Date')}" />
					
						<g:sortableColumn property="createdBy" title="${message(code: 'organizationCore.createdBy.label', default: 'Created By')}" />
					
						<g:sortableColumn property="lastUpdateDate" title="${message(code: 'organizationCore.lastUpdateDate.label', default: 'Last Update Date')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${organizationCoreInstanceList}" status="i" var="organizationCoreInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${organizationCoreInstance.id}">${fieldValue(bean: organizationCoreInstance, field: "organizationId")}</g:link></td>
					
						<td>${fieldValue(bean: organizationCoreInstance, field: "organizationName")}</td>
					
						<td>${fieldValue(bean: organizationCoreInstance, field: "email")}</td>
					
						<td><g:formatDate date="${organizationCoreInstance.creationDate}" /></td>
					
						<td>${fieldValue(bean: organizationCoreInstance, field: "createdBy")}</td>
					
						<td><g:formatDate date="${organizationCoreInstance.lastUpdateDate}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${organizationCoreInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
