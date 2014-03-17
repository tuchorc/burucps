<%@ page import="ar.com.burucps.business.Subcontractor"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'subcontractor.label', default: 'Subcontractor')}" />
<title><g:message code="subcontractor.list.label" /></title>
</head>
<body>
	<a href="#list-subcontractor" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="create" action="create">
					<g:message code="subcontractor.new.label" />
				</g:link></li>
		</ul>
	</div>
	<div id="list-subcontractor" class="content scaffold-list" role="main">
		<h1>
			<g:message code="subcontractor.list.label" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<table>
			<thead>
				<tr>

					<th><g:message code="subcontractor.organization.label"
							default="Organization" /></th>

					<th><g:message code="subcontractor.businessUnit.label"
							default="Business Unit" /></th>

				</tr>
			</thead>
			<tbody>
				<g:each in="${subcontractorInstanceList}" status="i"
					var="subcontractorInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${subcontractorInstance.id}">
								${fieldValue(bean: subcontractorInstance, field: "organization")}
							</g:link></td>

						<td>
							${fieldValue(bean: subcontractorInstance, field: "businessUnit")}
						</td>

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
