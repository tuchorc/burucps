<%@ page import="ar.com.burucps.party.OrganizationCore"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'organizationCore.label', default: 'OrganizationCore')}" />
<title><g:message code="organizationCore.edit.label" /></title>
</head>
<body>
	<a href="#edit-organizationCore" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="list" action="index">
					<g:message code="organizationCore.list.label" />
				</g:link></li>
			<li><g:link class="create" action="create">
					<g:message code="organizationCore.new.label" />
				</g:link></li>
		</ul>
	</div>
	<div id="edit-organizationCore" class="content scaffold-edit"
		role="main">
		<h1>
			<g:message code="organizationCore.edit.label" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<g:hasErrors bean="${organizationCoreInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${organizationCoreInstance}" var="error">
					<li
						<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
							error="${error}" /></li>
				</g:eachError>
			</ul>
		</g:hasErrors>
		<g:form url="[resource:organizationCoreInstance, action:'update']"
			method="PUT">
			<g:hiddenField name="version"
				value="${organizationCoreInstance?.version}" />
			<fieldset class="form">
				<g:render template="form" />
				<div
					class="fieldcontain ${hasErrors(bean: organizationCoreInstance, field: 'roles', 'error')} ">
					<label for="roles"> <g:message
							code="organizationCore.roles.label" default="Roles" />
					</label>
					<ul class="one-to-many">
						<g:each in="${organizationCoreInstance?.roles?}" var="r">
							<li><g:link controller="organizationRole" action="show"
									id="${r.id}">
									${r?.encodeAsHTML()}
								</g:link></li>
						</g:each>
						<li class="add"><g:link controller="organizationRole"
								action="create"
								params="['organizationCore.id': organizationCoreInstance?.id]">
								${message(code: 'default.add.label', args: [message(code: 'organizationRole.label', default: 'OrganizationRole')])}
							</g:link></li>
					</ul>
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
