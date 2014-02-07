
<%@ page import="ar.com.burucps.business.Subcontractor" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'subcontractor.label', default: 'Subcontractor')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-subcontractor" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-subcontractor" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="uid" title="${message(code: 'subcontractor.uid.label', default: 'Uid')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'subcontractor.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'subcontractor.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="businessUnit" title="${message(code: 'subcontractor.businessUnit.label', default: 'Business Unit')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${subcontractorInstanceList}" status="i" var="subcontractorInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="index" id="${subcontractorInstance.id}">${fieldValue(bean: subcontractorInstance, field: "uid")}</g:link></td>
					
						<td>${fieldValue(bean: subcontractorInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: subcontractorInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: subcontractorInstance, field: "businessUnit")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${subcontractorInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
