
<%@ page import="ar.com.burucps.party.PersonCore"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'personCore.label', default: 'PersonCore')}" />
<title><g:message code="personCore.list.label" /></title>
</head>
<body>
	<a href="#list-personCore" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="create" action="create">
					<g:message code="personCore.new.label" />
				</g:link></li>
		</ul>
	</div>
	<div id="list-personCore" class="content scaffold-list" role="main">
		<h1>
			<g:message code="personCore.list.label" />
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
						title="${message(code: 'personCore.uid.label', default: 'Uid')}" />

					<g:sortableColumn property="surname"
						title="${message(code: 'personCore.surname.label', default: 'Surname')}" />

					<g:sortableColumn property="firstName"
						title="${message(code: 'personCore.firstName.label', default: 'First Name')}" />

					<g:sortableColumn property="email"
						title="${message(code: 'personCore.email.label', default: 'Email')}" />

					<g:sortableColumn property="creationDate"
						title="${message(code: 'default.creationDate.label', default: 'Creation Date')}" />

					<g:sortableColumn property="lastUpdateDate"
						title="${message(code: 'default.lastUpdateDate.label', default: 'Last Update Date')}" />

				</tr>
			</thead>
			<tbody>
				<g:each in="${personCoreInstanceList}" status="i"
					var="personCoreInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${personCoreInstance.id}">
								${fieldValue(bean: personCoreInstance, field: "uid")}
							</g:link></td>

						<td>
							${fieldValue(bean: personCoreInstance, field: "surname")}
						</td>

						<td>
							${fieldValue(bean: personCoreInstance, field: "firstName")}
						</td>

						<td>
							${fieldValue(bean: personCoreInstance, field: "email")}
						</td>

						<td><g:formatDate date="${personCoreInstance.creationDate}" format="EEE dd/MM/yyyy HH:mm:ss"/></td>

						<td><g:formatDate date="${personCoreInstance.lastUpdateDate}" format="EEE dd/MM/yyyy HH:mm:ss" /></td>

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
