package cl.ciisa.cokedb.controller.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;



public class ActualizarCentCostForm extends ActionForm{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -351709563678466899L;
	private int centId;
	private String centNombre;
	
	
	public int getCentId() {
		return centId;
	}
	public void setCentId(int centId) {
		this.centId = centId;
	}
	public String getCentNombre() {
		return centNombre;
	}
	public void setCentNombre(String centNombre) {
		this.centNombre = centNombre;
	}
	
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		
		if(this.centId == 0){
			errors.add("nombre", new ActionMessage("errors.detail",
			"Debe seleccionar un Centro de Costo"));
		}
		
		return errors;
	}

}
