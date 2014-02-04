<%@ page import="ar.com.burucps.business.BusinessUnit"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'businessUnit.label', default: 'BusinessUnit')}" />
<title><g:message code="businessUnit.list.label" /></title>
</head>
<body>
	<a href="#list-businessUnit" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="create" action="create">
					<g:message code="businessUnit.new.label" />
				</g:link></li>
		</ul>
	</div>
	<div id="list-businessUnit" class="content scaffold-list" role="main">
		<h1>
			<g:message code="businessUnit.list.label" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<table>
			<thead>
				<tr>

					<g:sortableColumn property="code"
						title="${message(code: 'businessUnit.code.label', default: 'Code')}" />

					<g:sortableColumn property="name"
						title="${message(code: 'businessUnit.name.label', default: 'Name')}" />

					<th><g:message code="businessUnit.coordinator.label"
							default="Coordinator" /></th>

					<th><g:message code="businessUnit.parent.label"
							default="Parent" /></th>

				</tr>
			</thead>
			<tbody>
				<g:each in="${businessUnitInstanceList}" status="i"
					var="businessUnitInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${businessUnitInstance.id}">
								${fieldValue(bean: businessUnitInstance, field: "code")}
							</g:link></td>

						<td>
							${fieldValue(bean: businessUnitInstance, field: "name")}
						</td>

						<td>
							${fieldValue(bean: businessUnitInstance, field: "coordinator")}
						</td>

						<td>
							${fieldValue(bean: businessUnitInstance, field: "parent")}
						</td>

					</tr>
				</g:each>
			</tbody>
		</table>
		<div class="pagination">
			<g:paginate total="${businessUnitInstanceCount ?: 0}" />
		</div>
	</div>
</body>
</html>
