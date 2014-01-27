
<%@ page import="ar.com.burucps.party.OrganizationCore"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'organizationCore.label', default: 'OrganizationCore')}" />
<title><g:message code="organizationCore.list.label" /></title>
</head>
<body>
	<a href="#list-organizationCore" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="create" action="create">
					<g:message code="organizationCore.new.label" />
				</g:link></li>
		</ul>
	</div>
	<div id="list-organizationCore" class="content scaffold-list"
		role="main">
		<h1>
			<g:message code="organizationCore.list.label" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<table>
			<thead>
				<tr>

					<g:sortableColumn property="uid"
						title="${message(code: 'organizationCore.uid.label', default: 'Uid')}" />

					<g:sortableColumn property="name"
						title="${message(code: 'organizationCore.name.label', default: 'Name')}" />

					<g:sortableColumn property="email"
						title="${message(code: 'organizationCore.email.label', default: 'Email')}" />

					<g:sortableColumn property="creationDate"
						title="${message(code: 'default.creationDate.label', default: 'Creation Date')}" />

					<g:sortableColumn property="lastUpdateDate"
						title="${message(code: 'default.lastUpdateDate.label', default: 'Last Update Date')}" />

				</tr>
			</thead>
			<tbody>
				<g:each in="${organizationCoreInstanceList}" status="i"
					var="organizationCoreInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${organizationCoreInstance.id}">
								${fieldValue(bean: organizationCoreInstance, field: "uid")}
							</g:link></td>

						<td>
							${fieldValue(bean: organizationCoreInstance, field: "name")}
						</td>

						<td>
							${fieldValue(bean: organizationCoreInstance, field: "email")}
						</td>

						<td><g:formatDate
								date="${organizationCoreInstance.creationDate}"
								format="EEE dd/MM/yyyy HH:mm:ss" /></td>

						<td><g:formatDate
								date="${organizationCoreInstance.lastUpdateDate}"
								format="EEE dd/MM/yyyy HH:mm:ss" /></td>

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
