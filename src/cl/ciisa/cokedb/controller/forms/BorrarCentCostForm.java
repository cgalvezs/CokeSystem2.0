package cl.ciisa.cokedb.controller.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class BorrarCentCostForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2081294532459335717L;
	private long centroCostoId;
	private String centroCostoNombre;
	
	public long getCentroCostoId() {
		return centroCostoId;
	}
	public void setCentroCostoId(long centroCostoId) {
		this.centroCostoId = centroCostoId;
	}
	public String getCentroCostoNombre() {
		return centroCostoNombre;
	}
	public void setCentroCostoNombre(String centroCostoNombre) {
		this.centroCostoNombre = centroCostoNombre;
	}
	
	

	/*
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		
		if(this.centNombre == null || this.centNombre.trim().length() <= 1 || this.centNombre.trim().length() >= 12){
			errors.add("nombre", new ActionMessage("errors.detail",
			"El nombre debe ser mayor de 4 caracteres y menor a 12 caracteres"));
		}
		
		return errors;
	}

	
	*/
	

}
