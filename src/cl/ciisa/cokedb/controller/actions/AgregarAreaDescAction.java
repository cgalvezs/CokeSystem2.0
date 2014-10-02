package cl.ciisa.cokedb.controller.actions;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import cl.ciisa.cokedb.controller.forms.AgregarAreaDescForm;
import cl.ciisa.cokedb.model.AreaDescBean;
import cl.ciisa.cokedb.services.impl.AreaDescService;
import cl.ciisa.cokedb.services.impl.CentCostService;
import cl.ciisa.cokedb.services.interfaces.IAreaDescService;
import cl.ciisa.cokedb.services.interfaces.ICentCostService;

public class AgregarAreaDescAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		ActionMessages messages = new ActionMessages();
		
		try {
			
			AgregarAreaDescForm areaDescForm = (AgregarAreaDescForm)form;
			
			AreaDescBean areaDescBean = new AreaDescBean();
			
			areaDescBean.setAreaNombre(areaDescForm.getAreaNombre());
			areaDescBean.setAreaGerente(areaDescForm.getAreaGerente());
			
			IAreaDescService iAreaDescService = new AreaDescService();
			
			iAreaDescService.insert(areaDescBean);
			
			
			ArrayList<AreaDescBean> areaDescList = iAreaDescService.getAll();
			request.setAttribute("areaDescList", areaDescList);
			
				
		} catch (Exception e) {
			messages.add("errors", new ActionMessage("errors.detail",e.getMessage()));
			this.saveErrors(request, messages);
			return mapping.findForward("failure");
		}
		
		return mapping.findForward("success");
	}

}
