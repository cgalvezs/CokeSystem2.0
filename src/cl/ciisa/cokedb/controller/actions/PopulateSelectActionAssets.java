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

import cl.ciisa.cokedb.model.AssetsTipoBean;
import cl.ciisa.cokedb.model.InvAssetsBean;
import cl.ciisa.cokedb.model.ItAssetsBean;
import cl.ciisa.cokedb.services.impl.AssetsTipoService;
import cl.ciisa.cokedb.services.impl.InvAssetsService;
import cl.ciisa.cokedb.services.impl.ItAssetsService;
import cl.ciisa.cokedb.services.interfaces.IAssetsTipoService;
import cl.ciisa.cokedb.services.interfaces.IInvAssetsService;
import cl.ciisa.cokedb.services.interfaces.IItAssetsService;


public class PopulateSelectActionAssets extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		ActionMessages messages = new ActionMessages();
		
		try {
						

			
			IAssetsTipoService iAssetsTipoService = new AssetsTipoService();
			ArrayList<AssetsTipoBean> assetsTipoList = iAssetsTipoService.getAll();
			request.setAttribute("assetsTipoList", assetsTipoList);
			
			IItAssetsService iItAssetsService = new ItAssetsService();
			ArrayList<ItAssetsBean> itAssetsList = iItAssetsService.getAll();
			request.setAttribute("itAssetsList", itAssetsList);
			
			IInvAssetsService iInvAssetsService = new InvAssetsService();
			ArrayList<InvAssetsBean> invAssetsList = iInvAssetsService.getAll();
			request.setAttribute("invAssetsList", invAssetsList);
			
			
	
			
				
		} catch (Exception e) {
			messages.add("errors", new ActionMessage("errors.detail",e.getMessage()));
			this.saveErrors(request, messages);
			return mapping.findForward("failure");
		}
		
		return mapping.findForward("success");
	}

}
