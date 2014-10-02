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

import cl.ciisa.cokedb.controller.forms.AgregarInventarioForm;
import cl.ciisa.cokedb.model.InvAssetsBean;
import cl.ciisa.cokedb.services.impl.InvAssetsService;
import cl.ciisa.cokedb.services.interfaces.IInvAssetsService;

public class AgregarInventarioAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		ActionMessages messages = new ActionMessages();
		
		try {
			
			AgregarInventarioForm invAssetsForm = (AgregarInventarioForm)form;
			
			InvAssetsBean invAssetsBean = new InvAssetsBean();
			
			invAssetsBean.setInvAssetsId(invAssetsForm.getInvAssetsId());
			invAssetsBean.setInvDate(invAssetsForm.getInvDate());
			invAssetsBean.setInvStock(invAssetsForm.getInvStock());
			invAssetsBean.setInvOtros(invAssetsForm.getInvOtros());
			
			IInvAssetsService iInvAssetsService = new InvAssetsService();
			
			iInvAssetsService.insert(invAssetsBean);
			
			ArrayList<InvAssetsBean> invAssetstList = iInvAssetsService.getAll();
			request.setAttribute("invAssetstList", invAssetstList);
			
				
		} catch (Exception e) {
			messages.add("errors", new ActionMessage("errors.detail",e.getMessage()));
			this.saveErrors(request, messages);
			return mapping.findForward("failure");
		}
		
		return mapping.findForward("success");
	}

}
