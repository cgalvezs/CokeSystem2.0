package cl.ciisa.cokedb.dao.interfaces;

import java.util.ArrayList;

import cl.ciisa.cokedb.dao.impl.DAOException;
import cl.ciisa.cokedb.model.palletsBeans;

public interface IPalletsDAO {
	
	public ArrayList<palletsBeans> getAll()throws DAOException;
	public Integer insert(palletsBeans pallets) throws DAOException;
	public boolean update(palletsBeans pallets) throws DAOException;
	public boolean delete(palletsBeans pallets) throws DAOException;

}
