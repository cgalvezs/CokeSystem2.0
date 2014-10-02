package cl.ciisa.cokedb.controller.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AgregarTipoForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1680264689171308779L;
	private int tipoActivoId;
	private String tipoActivoTipo;
	
	public void setTipoActivoId(int tipoActivoId){
		this.tipoActivoId = tipoActivoId;
	}
	
	public int getTipoActivoId(){
		return this.tipoActivoId;
	}
	
	public void setTipoActivoTipo(String tipoActivoTipo){
		this.tipoActivoTipo = tipoActivoTipo;
	}
	
	public String getTipoActivoTipo(){
		return this.tipoActivoTipo;
	}
	

}
