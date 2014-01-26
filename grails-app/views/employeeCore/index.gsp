
<%@ page import="ar.com.burucps.business.EmployeeCore" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employeeCore.label', default: 'EmployeeCore')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-employeeCore" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-employeeCore" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="uid" title="${message(code: 'employeeCore.uid.label', default: 'Uid')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'employeeCore.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'employeeCore.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="creationDate" title="${message(code: 'employeeCore.creationDate.label', default: 'Creation Date')}" />
					
						<g:sortableColumn property="createdBy" title="${message(code: 'employeeCore.createdBy.label', default: 'Created By')}" />
					
						<g:sortableColumn property="lastUpdateDate" title="${message(code: 'employeeCore.lastUpdateDate.label', default: 'Last Update Date')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${employeeCoreInstanceList}" status="i" var="employeeCoreInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${employeeCoreInstance.id}">${fieldValue(bean: employeeCoreInstance, field: "uid")}</g:link></td>
					
						<td>${fieldValue(bean: employeeCoreInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: employeeCoreInstance, field: "email")}</td>
					
						<td><g:formatDate date="${employeeCoreInstance.creationDate}" /></td>
					
						<td>${fieldValue(bean: employeeCoreInstance, field: "createdBy")}</td>
					
						<td><g:formatDate date="${employeeCoreInstance.lastUpdateDate}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${employeeCoreInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
