<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL name="/saveformurl" var="saveformurl">
</liferay-portlet:actionURL>

<p>
	<b><liferay-ui:message key="portletcommandtemplate.caption"/></b>
</p>

<form id="template-form" class="" action="<%= saveformurl %>" method="POST" >
	<div class="">
		<div class="md-form form-group">
			<input id="formparam" type="text" name="<portlet:namespace/>formparam" value="" class="form-control">
			<label for="formparam" > <liferay-ui:message key="portletcommandtemplate.inputParamLabel" /> </label>
		</div>
	</div>
</form>

<div class="md-form form-group">
	<input id="formparam" type="text" value="${ formparamcatched }" class="form-control" readonly>
	<label for="formparam" > Input Value Catched </label>
</div>


${ PM }

