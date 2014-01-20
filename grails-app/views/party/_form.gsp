<%@ page import="ar.com.burucps.party.Party" %>



<div class="fieldcontain ${hasErrors(bean: partyInstance, field: 'uid', 'error')} required">
	<label for="uid">
		<g:message code="party.uid.label" default="Uid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="uid" required="" value="${partyInstance?.uid}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: partyInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="party.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${partyInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: partyInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="party.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" value="${partyInstance?.email}"/>
</div>

