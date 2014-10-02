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
import org.apache.struts.util.LabelValueBean;

import cl.ciisa.cokedb.controller.forms.AgregarUsuarioForm;
import cl.ciisa.cokedb.model.CentCostBean;
import cl.ciisa.cokedb.model.UserListBean;
import cl.ciisa.cokedb.services.impl.CentCostService;
import cl.ciisa.cokedb.services.impl.UserListService;
import cl.ciisa.cokedb.services.interfaces.ICentCostService;
import cl.ciisa.cokedb.services.interfaces.IUserListService;

public class AgregarUsuarioAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		ActionMessages messages = new ActionMessages();
		
		try {
			
			AgregarUsuarioForm userListForm = (AgregarUsuarioForm)form;
			
			UserListBean userListBean = new UserListBean();
			
			userListBean.setUserCostCentId(userListForm.getUserCentCostId());
			userListBean.setUserDescAreaId(userListForm.getUserDescAreaId());
			userListBean.setUserNombre(userListForm.getUserName());
			userListBean.setUserEmail(userListForm.getUserEmail());
			
			
			
			IUserListService iUserListService = new UserListService();
			
			ICentCostService iCentCostBean = new CentCostService();
			
			iUserListService.insert(userListBean);
			
			
			ArrayList<UserListBean> lstUserList = iUserListService.getAll();
			request.setAttribute("lstUserList", lstUserList);
	
			
				
		} catch (Exception e) {
			messages.add("errors", new ActionMessage("errors.detail",e.getMessage()));
			this.saveErrors(request, messages);
			return mapping.findForward("failure");
		}
		
		return mapping.findForward("success");
	}

}
