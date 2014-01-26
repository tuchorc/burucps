<%@ page import="ar.com.burucps.business.Seller" %>



<div class="fieldcontain ${hasErrors(bean: sellerInstance, field: 'group', 'error')} required">
	<label for="group">
		<g:message code="seller.group.label" default="Group" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="group" name="group.id" from="${ar.com.burucps.business.Branch.list()}" optionKey="id" required="" value="${sellerInstance?.group?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sellerInstance, field: 'transactions', 'error')} ">
	<label for="transactions">
		<g:message code="seller.transactions.label" default="Transactions" />
		
	</label>
	<g:select name="transactions" from="${ar.com.burucps.sales.Transaction.list()}" multiple="multiple" optionKey="id" size="5" value="${sellerInstance?.transactions*.id}" class="many-to-many"/>
</div>

