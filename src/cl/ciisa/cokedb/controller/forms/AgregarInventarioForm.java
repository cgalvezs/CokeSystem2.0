package cl.ciisa.cokedb.controller.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AgregarInventarioForm extends ActionForm{
	
	private int invId;
	private int invAssetsId;
	private String invDate;
	private String invStock;
	private String invOtros;
	
	public void setInvId(int invId){
		this.invId = invId;
	}

	public int getInvId(){
		return this.invId;
	}
	
	public void setInvAssetsId(int invAssetsId){
		this.invAssetsId = invAssetsId;
	}
	
	public int getInvAssetsId(){
		return this.invAssetsId;
	}
	
	public void setInvDate(String invDate){
		this.invDate = invDate;
	}
	
	public String getInvDate(){
		return this.invDate;
	}
	
	public void setInvStock(String invStock){
		this.invStock = invStock;
	}
	
	public String getInvStock(){
		return this.invStock;
	}
	
	public void setInvOtros(String invOtros){
		this.invOtros = invOtros;
	}
	
	public String getInvOtros(){
		return this.invOtros;
	}

}
