
<%@ page import="ar.com.burucps.party.PersonCore"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'personCore.label', default: 'PersonCore')}" />
<title><g:message code="personCore.show.label"
		args="[entityName]" /></title>
</head>
<body>
	<a href="#show-personCore" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="list" action="index">
					<g:message code="personCore.list.label" />
				</g:link></li>
			<li><g:link class="create" action="create">
					<g:message code="personCore.new.label" />
				</g:link></li>
		</ul>
	</div>
	<div id="show-personCore" class="content scaffold-show" role="main">
		<h1>
			<g:message code="personCore.show.label" args="[entityName]" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<ol class="property-list personCore">

			<g:if test="${personCoreInstance?.uid}">
				<li class="fieldcontain"><span id="uid-label"
					class="property-label"><g:message
							code="personCore.uid.label" default="Uid" /></span> <span
					class="property-value" aria-labelledby="uid-label"><g:fieldValue
							bean="${personCoreInstance}" field="uid" /></span></li>
			</g:if>

			<g:if test="${personCoreInstance?.firstName}">
				<li class="fieldcontain"><span id="firstName-label"
					class="property-label"><g:message
							code="personCore.firstName.label" default="First Name" /></span> <span
					class="property-value" aria-labelledby="firstName-label"><g:fieldValue
							bean="${personCoreInstance}" field="firstName" /></span></li>
			</g:if>

			<g:if test="${personCoreInstance?.middleNames}">
				<li class="fieldcontain"><span id="middleNames-label"
					class="property-label"><g:message
							code="personCore.middleNames.label" default="Middle Names" /></span> <span
					class="property-value" aria-labelledby="middleNames-label"><g:fieldValue
							bean="${personCoreInstance}" field="middleNames" /></span></li>
			</g:if>

			<g:if test="${personCoreInstance?.surname}">
				<li class="fieldcontain"><span id="surname-label"
					class="property-label"><g:message
							code="personCore.surname.label" default="Surname" /></span> <span
					class="property-value" aria-labelledby="surname-label"><g:fieldValue
							bean="${personCoreInstance}" field="surname" /></span></li>
			</g:if>

			<g:if test="${personCoreInstance?.email}">
				<li class="fieldcontain"><span id="email-label"
					class="property-label"><g:message
							code="personCore.email.label" default="Email" /></span> <span
					class="property-value" aria-labelledby="email-label"><g:fieldValue
							bean="${personCoreInstance}" field="email" /></span></li>
			</g:if>

			<g:if test="${personCoreInstance?.dateOfBirth}">
				<li class="fieldcontain"><span id="dateOfBirth-label"
					class="property-label"><g:message
							code="personCore.dateOfBirth.label" default="Date Of Birth" /></span> <span
					class="property-value" aria-labelledby="dateOfBirth-label"><g:formatDate
							date="${personCoreInstance?.dateOfBirth}" format="dd/MM/yyyy"/></span></li>
			</g:if>

			<g:if test="${personCoreInstance?.roles}">
				<li class="fieldcontain"><span id="roles-label"
					class="property-label"><g:message
							code="personCore.roles.label" default="Roles" /></span> <g:each
						in="${personCoreInstance.roles}" var="r">
						<span class="property-value" aria-labelledby="roles-label"><g:link
								controller="personRole" action="show" id="${r.id}">
								${r?.encodeAsHTML()}
							</g:link></span>
					</g:each></li>
			</g:if>

			<g:if test="${personCoreInstance?.creationDate}">
				<li class="fieldcontain"><span id="creationDate-label"
					class="property-label"><g:message
							code="default.creationDate.label" default="Creation Date" /></span>

					<span class="property-value" aria-labelledby="creationDate-label"><g:formatDate
							date="${personCoreInstance?.creationDate}" format="EEE dd/MM/yyyy HH:mm:ss"/></span></li>
			</g:if>

			<g:if test="${personCoreInstance?.createdBy}">
				<li class="fieldcontain"><span id="createdBy-label"
					class="property-label"><g:message
							code="default.createdBy.label" default="Created By" /></span> <span
					class="property-value" aria-labelledby="createdBy-label"><g:fieldValue
							bean="${personCoreInstance}" field="createdBy" /></span></li>
			</g:if>

			<g:if test="${personCoreInstance?.lastUpdateDate}">
				<li class="fieldcontain"><span id="lastUpdateDate-label"
					class="property-label"><g:message
							code="default.lastUpdateDate.label" default="Last Update Date" /></span>

					<span class="property-value" aria-labelledby="lastUpdateDate-label"><g:formatDate
							date="${personCoreInstance?.lastUpdateDate}" format="EEE dd/MM/yyyy HH:mm:ss"/></span></li>
			</g:if>

			<g:if test="${personCoreInstance?.lastUpdateBy}">
				<li class="fieldcontain"><span id="lastUpdateBy-label"
					class="property-label"><g:message
							code="default.lastUpdateBy.label" default="Last Update By" /></span>

					<span class="property-value" aria-labelledby="lastUpdateBy-label"><g:fieldValue
							bean="${personCoreInstance}" field="lastUpdateBy" /></span></li>
			</g:if>

		</ol>
		<g:form url="[resource:personCoreInstance, action:'delete']"
			method="DELETE">
			<fieldset class="buttons">
				<g:link class="edit" action="edit" resource="${personCoreInstance}">
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
