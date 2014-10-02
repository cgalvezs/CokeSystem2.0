package cl.ciisa.cokedb.controller.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class BorrarAreaDescForm extends ActionForm{


	/**
	 * 
	 */
	private static final long serialVersionUID = -3753281164486329645L;
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
	
	
}
