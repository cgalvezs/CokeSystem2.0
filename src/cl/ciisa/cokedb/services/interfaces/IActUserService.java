package cl.ciisa.cokedb.services.interfaces;

import java.util.ArrayList;

import cl.ciisa.cokedb.model.ActUserBean;
import cl.ciisa.cokedb.services.impl.LogicaException;

public interface IActUserService {
	
	public long insert(ActUserBean auser) throws LogicaException;
	public ArrayList<ActUserBean> getAll() throws LogicaException;
	public boolean update(ActUserBean adesc) throws LogicaException;

}
