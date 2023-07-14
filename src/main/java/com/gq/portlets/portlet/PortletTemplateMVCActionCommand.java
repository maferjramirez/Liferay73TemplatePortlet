package com.gq.portlets.portlet;

import com.gq.portlets.constants.PortletCommandTemplatePortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author martinfernandojimenezramirez
 */

@Component(
	 property = {
		 "javax.portlet.name="+ PortletCommandTemplatePortletKeys.PORTLETCOMMANDTEMPLATE,
		 "mvc.command.name=/saveformurl"
	 },
	 service = MVCActionCommand.class
 )


public class PortletTemplateMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
	    StringBuilder result = new StringBuilder();

	    Map<String, String[]> pm = actionRequest.getParameterMap();
	    for(String key:pm.keySet()) {
	        result.append(key).append(": [ ");
	        String[] value = pm.get(key);
	        if(value != null) {
	            for(String val:value) {
	                result.append(val).append(" ");
	            }
	        }
	        result.append("]<br/>");

	    }

	    //actionResponse.setRenderParameter("PM", result.toString());
	    actionRequest.setAttribute("PM", result.toString());
		
		String formParam = ParamUtil.getString(actionRequest, "formparam");
		actionRequest.setAttribute("formparamcatched", formParam);
		_log.info("Param: "+formParam);
		
		
		
	}
	
	private static final Log _log = LogFactoryUtil.getLog(
			PortletTemplateMVCActionCommand.class);
}
