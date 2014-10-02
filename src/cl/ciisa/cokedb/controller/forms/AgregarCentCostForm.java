package cl.ciisa.cokedb.controller.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;



public class AgregarCentCostForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2081294532459335717L;
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
		
		if(this.centNombre == null || this.centNombre.trim().length() <= 1 || this.centNombre.trim().length() >= 12){
			errors.add("nombre", new ActionMessage("errors.detail",
			"El nombre debe ser mayor de 1 caracteres y menor a 12 caracteres"));
		}
		
		
		
		return errors;
	}

	
	
	

}
