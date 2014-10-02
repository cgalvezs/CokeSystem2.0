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

import cl.ciisa.cokedb.controller.forms.AgregarTipoForm;
import cl.ciisa.cokedb.model.AssetsTipoBean;
import cl.ciisa.cokedb.services.impl.AssetsTipoService;
import cl.ciisa.cokedb.services.interfaces.IAssetsTipoService;

public class AgregarTipoAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		ActionMessages messages = new ActionMessages();
		
		try {
			
			AgregarTipoForm assetTipoForm = (AgregarTipoForm)form;
			
			AssetsTipoBean assetTipoBean = new AssetsTipoBean();
			
			assetTipoBean.setTipoActivoTipo(assetTipoForm.getTipoActivoTipo());
			
			
			IAssetsTipoService iAssetsTipoService = new AssetsTipoService();
			
			iAssetsTipoService.insert(assetTipoBean);
			
			
			ArrayList<AssetsTipoBean> assetsTipoList = iAssetsTipoService.getAll();
			request.setAttribute("assetsTipoList", assetsTipoList);
			
				
		} catch (Exception e) {
			messages.add("errors", new ActionMessage("errors.detail",e.getMessage()));
			this.saveErrors(request, messages);
			return mapping.findForward("failure");
		}
		
		return mapping.findForward("success");
	}

}
