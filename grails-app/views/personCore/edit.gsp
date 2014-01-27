<%@ page import="ar.com.burucps.party.PersonCore"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'personCore.label', default: 'PersonCore')}" />
<title><g:message code="default.edit.label" args="[entityName]" /></title>
</head>
<body>
	<a href="#edit-personCore" class="skip" tabindex="-1"><g:message
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
	<div id="edit-personCore" class="content scaffold-edit" role="main">
		<h1>
			<g:message code="default.edit.label" args="[entityName]" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<g:hasErrors bean="${personCoreInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${personCoreInstance}" var="error">
					<li
						<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
							error="${error}" /></li>
				</g:eachError>
			</ul>
		</g:hasErrors>
		<g:form url="[resource:personCoreInstance, action:'update']"
			method="PUT">
			<g:hiddenField name="version" value="${personCoreInstance?.version}" />
			<fieldset class="form">
				<g:render template="form" />
				<div
					class="fieldcontain ${hasErrors(bean: personCoreInstance, field: 'roles', 'error')} ">
					<label for="roles"> <g:message
							code="personCore.roles.label" default="Roles" />
					</label>
					<ul class="one-to-many">
						<g:each in="${personCoreInstance?.roles?}" var="r">
							<li><g:link controller="personRole" action="show"
									id="${r.id}">
									${r?.encodeAsHTML()}
								</g:link></li>
						</g:each>
						<li class="add"><g:link controller="personRole"
								action="create"
								params="['personCore.id': personCoreInstance?.id]">
								${message(code: 'default.add.label', args: [message(code: 'personRole.label', default: 'PersonRole')])}
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
