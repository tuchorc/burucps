
<%@ page import="ar.com.burucps.party.PersonCore" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'personCore.label', default: 'PersonCore')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-personCore" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-personCore" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="uid" title="${message(code: 'personCore.uid.label', default: 'Uid')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'personCore.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'personCore.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="creationDate" title="${message(code: 'personCore.creationDate.label', default: 'Creation Date')}" />
					
						<g:sortableColumn property="createdBy" title="${message(code: 'personCore.createdBy.label', default: 'Created By')}" />
					
						<g:sortableColumn property="lastUpdateDate" title="${message(code: 'personCore.lastUpdateDate.label', default: 'Last Update Date')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${personCoreInstanceList}" status="i" var="personCoreInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${personCoreInstance.id}">${fieldValue(bean: personCoreInstance, field: "uid")}</g:link></td>
					
						<td>${fieldValue(bean: personCoreInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: personCoreInstance, field: "email")}</td>
					
						<td><g:formatDate date="${personCoreInstance.creationDate}" /></td>
					
						<td>${fieldValue(bean: personCoreInstance, field: "createdBy")}</td>
					
						<td><g:formatDate date="${personCoreInstance.lastUpdateDate}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${personCoreInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
