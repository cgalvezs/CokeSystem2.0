package cl.ciisa.cokedb.services.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import cl.ciisa.cokedb.dao.impl.DAOException;
import cl.ciisa.cokedb.dao.impl.DataSourceFactory;
import cl.ciisa.cokedb.dao.impl.ItAssetsDAO;
import cl.ciisa.cokedb.dao.interfaces.IItAssetsDAO;
import cl.ciisa.cokedb.model.ItAssetsBean;
import cl.ciisa.cokedb.services.impl.LogicaException;
import cl.ciisa.cokedb.services.interfaces.IItAssetsService;

public class ItAssetsService implements IItAssetsService{
	
	public long insert(ItAssetsBean iassets) throws LogicaException{
		Connection con = null;
		try {
			
			con = DataSourceFactory.getConnection();
			IItAssetsDAO itAssetsDAO = new ItAssetsDAO(con);
			
			long pkUsuario = itAssetsDAO.insert(iassets);
			
			con.commit();
			return pkUsuario;
		} catch (DAOException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				throw new LogicaException(e);
			}
			throw new LogicaException(e);
		} catch (SQLException e1) {
			try {
				con.rollback();
			} catch (SQLException e) {
				throw new LogicaException(e1);
			}
			throw new LogicaException(e1);
		} finally {
			DataSourceFactory.desconectar(con);
		}
	}
	
	public ArrayList<ItAssetsBean> getAll() throws LogicaException{
		Connection con = null;
		try {
			
			con = DataSourceFactory.getConnection();
			IItAssetsDAO itAssetsDAO = new ItAssetsDAO(con);
			
			return itAssetsDAO.getAll();
			
		} catch (DAOException e) {
			throw new LogicaException(e);
		} finally {
			DataSourceFactory.desconectar(con);
		}
	}
	
	public boolean update(ItAssetsBean iassets) throws LogicaException {
		Connection con = null;
		try {
			con = DataSourceFactory.getConnection();
			
			IItAssetsDAO itAssetsDAO = new ItAssetsDAO(con);
			
			boolean sw = itAssetsDAO.update(iassets);
			
			con.commit();
			return sw;
		} catch (DAOException e) {
			throw new LogicaException(e);
		} catch (SQLException e) {
			throw new LogicaException(e);
		} finally {
			DataSourceFactory.desconectar(con);
		}
	}
	
	public ArrayList<ItAssetsBean> getAssetsIdName() throws LogicaException{
		Connection con = null;
		try {
			
			con = DataSourceFactory.getConnection();
			IItAssetsDAO itAssetsDAO = new ItAssetsDAO(con);
			
			return itAssetsDAO.getAssetsIdName();
			
		} catch (DAOException e) {
			throw new LogicaException(e);
		} finally {
			DataSourceFactory.desconectar(con);
		}
	}
	

}
