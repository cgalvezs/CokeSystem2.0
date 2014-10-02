package cl.ciisa.cokedb.services.interfaces;

import java.util.ArrayList;

import cl.ciisa.cokedb.model.CentCostBean;
import cl.ciisa.cokedb.services.impl.LogicaException;

public interface ICentCostService {
	
	public long insert(CentCostBean ccost) throws LogicaException;
	public ArrayList<CentCostBean> getAll() throws LogicaException;
	public void delete(long id) throws LogicaException;
	public boolean update(CentCostBean centcost) throws LogicaException;

}
