package cl.ciisa.cokedb.controller.forms;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AgregarItAssetsForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2616390479792663552L;
	
	private int itId;
	private int itAssetsId;
	private String itDesc;
	private String itOtros;
	
	public int getItId() {
		return itId;
	}
	public void setItId(int itId) {
		this.itId = itId;
	}
	public int getItAssetsId() {
		return itAssetsId;
	}
	public void setItAssetsId(int itAssetsId) {
		this.itAssetsId = itAssetsId;
	}
	public String getItDesc() {
		return itDesc;
	}
	public void setItDesc(String itDesc) {
		this.itDesc = itDesc;
	}
	public String getItOtros() {
		return itOtros;
	}
	public void setItOtros(String itOtros) {
		this.itOtros = itOtros;
	}

}
