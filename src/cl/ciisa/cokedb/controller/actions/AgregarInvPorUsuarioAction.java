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
import cl.ciisa.cokedb.controller.forms.AgregarInvPorUsuarioForm;
import cl.ciisa.cokedb.model.ActUserBean;
import cl.ciisa.cokedb.services.impl.ActUserService;
import cl.ciisa.cokedb.services.interfaces.IActUserService;



public class AgregarInvPorUsuarioAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		ActionMessages messages = new ActionMessages();
		
		try {
			
			AgregarInvPorUsuarioForm actUserForm = (AgregarInvPorUsuarioForm)form;
			
			ActUserBean actUserBean = new ActUserBean();
			
			actUserBean.setActAssetsItId(actUserForm.getAssetId());
			actUserBean.setActListUserId(actUserForm.getUserId());
			actUserBean.setActCondOut(actUserForm.getContOut());
			actUserBean.setActCondReturn(actUserForm.getCondReturn());
			actUserBean.setActOtros(actUserForm.getActOtros());
			
			IActUserService iAcUserService = new ActUserService();
			
			iAcUserService.insert(actUserBean);
			
			ArrayList<ActUserBean> lstActUser = iAcUserService.getAll();
			request.setAttribute("lstActUser", lstActUser);
			
				
		} catch (Exception e) {
			messages.add("errors", new ActionMessage("errors.detail",e.getMessage()));
			this.saveErrors(request, messages);
			return mapping.findForward("failure");
		}
		
		return mapping.findForward("success");
	}

}
