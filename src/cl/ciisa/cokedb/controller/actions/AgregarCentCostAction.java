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

import cl.ciisa.cokedb.controller.forms.AgregarCentCostForm;
import cl.ciisa.cokedb.model.CentCostBean;
import cl.ciisa.cokedb.services.impl.CentCostService;
import cl.ciisa.cokedb.services.interfaces.ICentCostService;


public class AgregarCentCostAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		ActionMessages messages = new ActionMessages();
		
		try {
			
			AgregarCentCostForm centCostForm = (AgregarCentCostForm)form;
			
			CentCostBean centCostBean = new CentCostBean();
			
			centCostBean.setCentroCostoNombre(centCostForm.getCentNombre());
			
			
			ICentCostService iCentCostService = new CentCostService();
			
			iCentCostService.insert(centCostBean);
			
			
			ArrayList<CentCostBean> centCostList = iCentCostService.getAll();
			request.setAttribute("centCostList", centCostList);
			
				
		} catch (Exception e) {
			messages.add("errors", new ActionMessage("errors.detail",e.getMessage()));
			this.saveErrors(request, messages);
			return mapping.findForward("failure");
		}
		
		return mapping.findForward("success");
	}

}
