package cl.ciisa.cokedb.controller.forms;

import org.apache.struts.action.ActionForm;

public class ActualizarUsuarioForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5247670568339020134L;
	
	private int userDescAreaId;
	private int userCentCostId;
	private String userName;
	private String userEmail;
	private int userId;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserDescAreaId() {
		return userDescAreaId;
	}
	public void setUserDescAreaId(int userDescAreaId) {
		this.userDescAreaId = userDescAreaId;
	}

	public int getUserCentCostId() {
		return userCentCostId;
	}
	public void setUserCentCostId(int userCentCostId) {
		this.userCentCostId = userCentCostId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	/*
	
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
		
		if(this.centNombre == null || this.centNombre.trim().length() <= 4 || this.centNombre.trim().length() >= 12){
			errors.add("nombre", new ActionMessage("errors.detail",
			"El nombre debe ser mayor de 4 caracteres y menor a 12 caracteres"));
		}
		
		return errors;
	}
	*/
}
