package cl.ciisa.cokedb.controller.forms;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AgregarInvPorUsuarioForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = -621027622445643267L;
	
	private int userId;
	private int assetId;
	private Date dateOut;
	private String contOut;
	private String condReturn;
	private String actOtros;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public Date getDateOut() {
		return dateOut;
	}
	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}
	public String getContOut() {
		return contOut;
	}
	public void setContOut(String contOut) {
		this.contOut = contOut;
	}
	public String getCondReturn() {
		return condReturn;
	}
	public void setCondReturn(String condReturn) {
		this.condReturn = condReturn;
	}
	public String getActOtros() {
		return actOtros;
	}
	public void setActOtros(String actOtros) {
		this.actOtros = actOtros;
	}
	
	
	

}
