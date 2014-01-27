<%@ page import="ar.com.burucps.business.BusinessUnit"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'businessUnit.label', default: 'BusinessUnit')}" />
<title><g:message code="businessUnit.edit.label" /></title>
</head>
<body>
	<a href="#edit-businessUnit" class="skip" tabindex="-1"><g:message
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
	<div id="edit-businessUnit" class="content scaffold-edit" role="main">
		<h1>
			<g:message code="businessUnit.edit.label" args="[entityName]" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<g:hasErrors bean="${businessUnitInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${businessUnitInstance}" var="error">
					<li
						<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
							error="${error}" /></li>
				</g:eachError>
			</ul>
		</g:hasErrors>
		<g:form url="[resource:businessUnitInstance, action:'update']"
			method="PUT">
			<g:hiddenField name="version"
				value="${businessUnitInstance?.version}" />
			<fieldset class="form">
				<g:render template="form" />
				<div
					class="fieldcontain ${hasErrors(bean: businessUnitInstance, field: 'salesRepresentatives', 'error')} ">
					<label for="salesRepresentatives"> <g:message
							code="businessUnit.salesRepresentatives.label"
							default="Sales Representatives" />

					</label>
					<g:select name="salesRepresentatives"
						from="${ar.com.burucps.party.Party.list()}" multiple="multiple"
						optionKey="id" size="5"
						value="${businessUnitInstance?.salesRepresentatives*.id}"
						class="many-to-many" />
				</div>

			</fieldset>
			<fieldset class="buttons">
				<g:actionSubmit class="save" action="update"
					value="${message(code: 'default.button.update.label', default: 'Update')}" />
			</fieldset>
		</g:form>
	</div>
</body>
</html>