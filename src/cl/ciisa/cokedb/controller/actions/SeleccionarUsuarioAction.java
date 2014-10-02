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
import cl.ciisa.cokedb.controller.forms.SeleccionarUsuarioForm;
import cl.ciisa.cokedb.model.AreaDescBean;
import cl.ciisa.cokedb.model.CentCostBean;
import cl.ciisa.cokedb.model.UserListBean;
import cl.ciisa.cokedb.services.impl.AreaDescService;
import cl.ciisa.cokedb.services.impl.CentCostService;
import cl.ciisa.cokedb.services.impl.UserListService;
import cl.ciisa.cokedb.services.interfaces.IAreaDescService;
import cl.ciisa.cokedb.services.interfaces.ICentCostService;
import cl.ciisa.cokedb.services.interfaces.IUserListService;

public class SeleccionarUsuarioAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		ActionMessages messages = new ActionMessages();
		
		try {
			
			SeleccionarUsuarioForm userListForm = (SeleccionarUsuarioForm)form;
			
			UserListBean userListBean = new UserListBean();
			
			userListBean.setUserId(userListForm.getUserId());
			
			IUserListService iUserListService = new UserListService();
			
			ArrayList<UserListBean> userList = iUserListService.getUser(userListBean.getUserId());
			request.setAttribute("userList", userList);
			
			ICentCostService iICentCostService = new CentCostService();
			
			ArrayList<CentCostBean> centCostList = iICentCostService.getAll();
			request.setAttribute("centCostList", centCostList);
			
			IAreaDescService iAreaDescService = new AreaDescService();
			
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
