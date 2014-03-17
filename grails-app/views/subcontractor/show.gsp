<%@ page import="ar.com.burucps.business.Subcontractor"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'subcontractor.label', default: 'Subcontractor')}" />
<title><g:message code="subcontractor.show.label" /></title>
</head>
<body>
	<a href="#show-subcontractor" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="list" action="index">
					<g:message code="subcontractor.list.label" />
				</g:link></li>
			<li><g:link class="create" action="create">
					<g:message code="subcontractor.new.label" />
				</g:link></li>
		</ul>
	</div>
	<div id="show-subcontractor" class="content scaffold-show" role="main">
		<h1>
			<g:message code="subcontractor.show.label" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<ol class="property-list subcontractor">

			<g:if test="${subcontractorInstance?.organization}">
				<li class="fieldcontain"><span id="organization-label"
					class="property-label"><g:message
							code="subcontractor.organization.label" default="Organization" /></span>

					<span class="property-value" aria-labelledby="organization-label"><g:link
							controller="organizationCore" action="show"
							id="${subcontractorInstance?.organization?.id}">
							${subcontractorInstance?.organization?.encodeAsHTML()}
						</g:link></span></li>
			</g:if>

			<g:if test="${subcontractorInstance?.businessUnit}">
				<li class="fieldcontain"><span id="businessUnit-label"
					class="property-label"><g:message
							code="subcontractor.businessUnit.label" default="Business Unit" /></span>

					<span class="property-value" aria-labelledby="businessUnit-label"><g:link
							controller="businessUnit" action="show"
							id="${subcontractorInstance?.businessUnit?.id}">
							${subcontractorInstance?.businessUnit?.encodeAsHTML()}
						</g:link></span></li>
			</g:if>

			<g:if test="${subcontractorInstance?.creationDate}">
				<li class="fieldcontain"><span id="creationDate-label"
					class="property-label"><g:message
							code="subcontractor.creationDate.label" default="Creation Date" /></span>

					<span class="property-value" aria-labelledby="creationDate-label"><g:formatDate
							date="${subcontractorInstance?.creationDate}" /></span></li>
			</g:if>

			<g:if test="${subcontractorInstance?.createdBy}">
				<li class="fieldcontain"><span id="createdBy-label"
					class="property-label"><g:message
							code="subcontractor.createdBy.label" default="Created By" /></span> <span
					class="property-value" aria-labelledby="createdBy-label"><g:fieldValue
							bean="${subcontractorInstance}" field="createdBy" /></span></li>
			</g:if>

			<g:if test="${subcontractorInstance?.lastUpdateDate}">
				<li class="fieldcontain"><span id="lastUpdateDate-label"
					class="property-label"><g:message
							code="subcontractor.lastUpdateDate.label"
							default="Last Update Date" /></span> <span class="property-value"
					aria-labelledby="lastUpdateDate-label"><g:formatDate
							date="${subcontractorInstance?.lastUpdateDate}" /></span></li>
			</g:if>

			<g:if test="${subcontractorInstance?.lastUpdateBy}">
				<li class="fieldcontain"><span id="lastUpdateBy-label"
					class="property-label"><g:message
							code="subcontractor.lastUpdateBy.label" default="Last Update By" /></span>

					<span class="property-value" aria-labelledby="lastUpdateBy-label"><g:fieldValue
							bean="${subcontractorInstance}" field="lastUpdateBy" /></span></li>
			</g:if>

			<g:if test="${subcontractorInstance?.transactions}">
				<li class="fieldcontain"><span id="transactions-label"
					class="property-label"><g:message
							code="subcontractor.transactions.label" default="Transactions" /></span>

					<g:each in="${subcontractorInstance.transactions}" var="t">
						<span class="property-value" aria-labelledby="transactions-label"><g:link
								controller="salesTransaction" action="show" id="${t.id}">
								${t?.encodeAsHTML()}
							</g:link></span>
					</g:each></li>
			</g:if>

		</ol>
		<g:form url="[resource:subcontractorInstance, action:'delete']"
			method="DELETE">
			<fieldset class="buttons">
				<g:link class="edit" action="edit"
					resource="${subcontractorInstance}">
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
