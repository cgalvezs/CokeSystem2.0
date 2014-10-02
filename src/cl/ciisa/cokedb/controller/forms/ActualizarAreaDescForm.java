package cl.ciisa.cokedb.controller.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class ActualizarAreaDescForm extends ActionForm{



	/**
	 * 
	 */
	private static final long serialVersionUID = 5878904423090171556L;
	private int areaId;
	private String areaNombre;
	private String areaGerente;
	
	public void setAreaId(int areaId){
		this.areaId = areaId;
	}
	
	public int getAreaId(){
		return this.areaId;
	}
	
	public void setAreaNombre(String areaNombre){
		this.areaNombre = areaNombre;
	}
	
	public String getAreaNombre(){
		return this.areaNombre;
	}
	
	public void setAreaGerente(String areaGerente){
		this.areaGerente = areaGerente;
	}
	
	public String getAreaGerente(){
		return this.areaGerente;
	}
	
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		
		if(this.areaId == 0 || this.areaNombre.trim().length() <= 2 || this.areaNombre.trim().length() >= 12){
			errors.add("nombre", new ActionMessage("errors.detail",
			"El nombre debe ser mayor de 4 caracteres y menor a 12 caracteres"));
		}
		
		if(this.areaGerente == ""){
			errors.add("nombre", new ActionMessage("errors.detail",
			"Debe Ingresar Nombre Gerente"));
		}
		
		return errors;
	}
	
	
}