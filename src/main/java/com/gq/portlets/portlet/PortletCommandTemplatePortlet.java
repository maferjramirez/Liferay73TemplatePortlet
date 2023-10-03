package com.gq.portlets.portlet;

import com.gq.portlets.constants.PortletCommandTemplatePortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author martinfernandojimenezramirez
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PortletCommandTemplate",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PortletCommandTemplatePortletKeys.PORTLETCOMMANDTEMPLATE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
		//"com.liferay.portlet.requires-namespaced-parameters=false"
	},
	service = Portlet.class
)
public class PortletCommandTemplatePortlet extends MVCPortlet {

	@Override
	public void doView( RenderRequest renderRequest, RenderResponse renderResponse) 
			throws IOException, PortletException {
	
		//TO.DO
		super.doView(renderRequest, renderResponse);
	}
}
