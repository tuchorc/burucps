
<%@ page import="ar.com.burucps.party.PersonRole" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'personRole.label', default: 'PersonRole')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-personRole" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-personRole" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="uid" title="${message(code: 'personRole.uid.label', default: 'Uid')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'personRole.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'personRole.email.label', default: 'Email')}" />
					
						<th><g:message code="personRole.person.label" default="Person" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${personRoleInstanceList}" status="i" var="personRoleInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${personRoleInstance.id}">${fieldValue(bean: personRoleInstance, field: "uid")}</g:link></td>
					
						<td>${fieldValue(bean: personRoleInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: personRoleInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: personRoleInstance, field: "person")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${personRoleInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
