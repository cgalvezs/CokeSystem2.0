package cl.ciisa.cokedb.services.interfaces;

import java.util.ArrayList;

import cl.ciisa.cokedb.model.AreaDescBean;
import cl.ciisa.cokedb.services.impl.LogicaException;

public interface IAreaDescService {
	
	public long insert(AreaDescBean adesc) throws LogicaException;
	public ArrayList<AreaDescBean> getAll() throws LogicaException;
	public boolean update(AreaDescBean adesc) throws LogicaException;
	public void delete(long id) throws LogicaException;

}
