<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL name="/saveformurl" var="saveformurl">
</liferay-portlet:actionURL>

<p>
	<b><liferay-ui:message key="portletcommandtemplate.caption"/></b>
</p>

<form id="template-form" class="" action="<%= saveformurl %>" method="POST" >
	<div class="form-group">
		<div class="input-group">
			<div class="input-group-item input-group-prepend">
				<input 
					id="formparam" 
					type="text" 
					name="<portlet:namespace/>formparam" 
					placeholder="<liferay-ui:message key="portletcommandtemplate.inputParamLabel" /> "
					class="form-control">
			</div>
				
			<div class="input-group-item input-group-append input-group-item-shrink">
				<button class="btn btn-secondary" type="submit">Submit</button>
			</div>
		</div>
	</div>
</form>

<div class="form-group">
	<input id="formparamval" type="text" value="${ formparamcatched }" class="form-control" readonly>
	<label for="formparamval" > Input Value Catched </label>
</div>


${ PM }

