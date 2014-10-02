package cl.ciisa.cokedb.controller.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import cl.ciisa.cokedb.model.AreaDescBean;
import cl.ciisa.cokedb.model.ItAssetsBean;
import cl.ciisa.cokedb.model.UserListBean;
import cl.ciisa.cokedb.services.impl.AreaDescService;
import cl.ciisa.cokedb.services.impl.ItAssetsService;
import cl.ciisa.cokedb.services.impl.UserListService;
import cl.ciisa.cokedb.services.interfaces.IAreaDescService;
import cl.ciisa.cokedb.services.interfaces.IItAssetsService;
import cl.ciisa.cokedb.services.interfaces.IUserListService;



public class PopulateSelectActionUsers extends Action{
	
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		ActionMessages messages = new ActionMessages();
		
		try {
						
			IUserListService userListService = new UserListService();
			ArrayList<UserListBean> userIdNameList = userListService.getUserNameAndId();
			
			request.setAttribute("userIdNameList", userIdNameList);
			
			IAreaDescService areaDescService = new AreaDescService();
			ArrayList<AreaDescBean> areaDescList = areaDescService.getAll();
			
			request.setAttribute("areaDescList", areaDescList);
			
			IItAssetsService iItAssetsService = new ItAssetsService();
			ArrayList<ItAssetsBean> idNameItAssetsList = iItAssetsService.getAssetsIdName();
			
			request.setAttribute("idNameItAssetsList", idNameItAssetsList);
			
			IUserListService iUserListService = new UserListService();
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
