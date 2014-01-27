<%@ page import="ar.com.burucps.business.BusinessUnit"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'businessUnit.label', default: 'BusinessUnit')}" />
<title><g:message code="businessUnit.show.label" /></title>
</head>
<body>
	<a href="#show-businessUnit" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="list" action="index">
					<g:message code="businessUnit.list.label" />
				</g:link></li>
			<li><g:link class="create" action="create">
					<g:message code="businessUnit.new.label" />
				</g:link></li>
		</ul>
	</div>
	<div id="show-businessUnit" class="content scaffold-show" role="main">
		<h1>
			<g:message code="businessUnit.show.label" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<ol class="property-list businessUnit">

			<g:if test="${businessUnitInstance?.code}">
				<li class="fieldcontain"><span id="code-label"
					class="property-label"><g:message
							code="businessUnit.code.label" default="Code" /></span> <span
					class="property-value" aria-labelledby="code-label"><g:fieldValue
							bean="${businessUnitInstance}" field="code" /></span></li>
			</g:if>

			<g:if test="${businessUnitInstance?.name}">
				<li class="fieldcontain"><span id="name-label"
					class="property-label"><g:message
							code="businessUnit.name.label" default="Name" /></span> <span
					class="property-value" aria-labelledby="name-label"><g:fieldValue
							bean="${businessUnitInstance}" field="name" /></span></li>
			</g:if>

			<g:if test="${businessUnitInstance?.parent}">
				<li class="fieldcontain"><span id="parent-label"
					class="property-label"><g:message
							code="businessUnit.parent.label" default="Parent" /></span> <span
					class="property-value" aria-labelledby="parent-label"><g:link
							controller="businessUnit" action="show"
							id="${businessUnitInstance?.parent?.id}">
							${businessUnitInstance?.parent?.encodeAsHTML()}
						</g:link></span></li>
			</g:if>

			<g:if test="${businessUnitInstance?.coordinator}">
				<li class="fieldcontain"><span id="coordinator-label"
					class="property-label"><g:message
							code="businessUnit.coordinator.label" default="Coordinator" /></span> <span
					class="property-value" aria-labelledby="coordinator-label"><g:link
							controller="coordinator" action="show"
							id="${businessUnitInstance?.coordinator?.id}">
							${businessUnitInstance?.coordinator?.encodeAsHTML()}
						</g:link></span></li>
			</g:if>

			<g:if test="${businessUnitInstance?.salesRepresentatives}">
				<li class="fieldcontain"><span id="salesRepresentatives-label"
					class="property-label"><g:message
							code="businessUnit.salesRepresentatives.label"
							default="Sales Representatives" /></span> <g:each
						in="${businessUnitInstance.salesRepresentatives}" var="s">
						<span class="property-value"
							aria-labelledby="salesRepresentatives-label"><g:link
								controller="party" action="show" id="${s.id}">
								${s?.encodeAsHTML()}
							</g:link></span>
					</g:each></li>
			</g:if>

			<g:if test="${businessUnitInstance?.creationDate}">
				<li class="fieldcontain"><span id="creationDate-label"
					class="property-label"><g:message
							code="default.creationDate.label" default="Creation Date" /></span> <span
					class="property-value" aria-labelledby="creationDate-label"><g:formatDate
							date="${businessUnitInstance?.creationDate}"
							format="EEE dd/MM/yyyy HH:mm:ss" /></span></li>
			</g:if>

			<g:if test="${businessUnitInstance?.createdBy}">
				<li class="fieldcontain"><span id="createdBy-label"
					class="property-label"><g:message
							code="default.createdBy.label" default="Created By" /></span> <span
					class="property-value" aria-labelledby="createdBy-label"><g:fieldValue
							bean="${businessUnitInstance}" field="createdBy" /></span></li>
			</g:if>

			<g:if test="${businessUnitInstance?.lastUpdateDate}">
				<li class="fieldcontain"><span id="lastUpdateDate-label"
					class="property-label"><g:message
							code="default.lastUpdateDate.label" default="Last Update Date" /></span>

					<span class="property-value" aria-labelledby="lastUpdateDate-label"><g:formatDate
							date="${businessUnitInstance?.lastUpdateDate}"
							format="EEE dd/MM/yyyy HH:mm:ss" /></span></li>
			</g:if>

			<g:if test="${businessUnitInstance?.lastUpdateBy}">
				<li class="fieldcontain"><span id="lastUpdateBy-label"
					class="property-label"><g:message
							code="default.lastUpdateBy.label" default="Last Update By" /></span> <span
					class="property-value" aria-labelledby="lastUpdateBy-label"><g:fieldValue
							bean="${businessUnitInstance}" field="lastUpdateBy" /></span></li>
			</g:if>

		</ol>
		<g:form url="[resource:businessUnitInstance, action:'delete']"
			method="DELETE">
			<fieldset class="buttons">
				<g:link class="edit" action="edit"
					resource="${businessUnitInstance}">
					<g:message code="default.button.edit.label" default="Edit" />
				</g:link>
				<g:actionSubmit class="delete" action="delete"
					value="${message(code: 'default.button.delete.label', default: 'Delete')}"
					onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
			</fieldset>
		</g:form>
	</div>
</body>
</html>
