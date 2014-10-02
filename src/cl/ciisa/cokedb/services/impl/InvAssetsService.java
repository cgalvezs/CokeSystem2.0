package cl.ciisa.cokedb.services.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import cl.ciisa.cokedb.dao.impl.DAOException;
import cl.ciisa.cokedb.dao.impl.DataSourceFactory;
import cl.ciisa.cokedb.dao.impl.InvAssetsDAO;
import cl.ciisa.cokedb.dao.interfaces.IInvAssetsDAO;
import cl.ciisa.cokedb.model.InvAssetsBean;
import cl.ciisa.cokedb.services.interfaces.IInvAssetsService;

public class InvAssetsService implements IInvAssetsService{
	
	public long insert(InvAssetsBean iAssets) throws LogicaException{
		Connection con = null;
		try {
			
			con = DataSourceFactory.getConnection();
			
			IInvAssetsDAO invAssetsDAO = new InvAssetsDAO(con);
			
			long pkUsuario = invAssetsDAO.insert(iAssets);
			
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
	
	public ArrayList<InvAssetsBean> getAll() throws LogicaException{
		Connection con = null;
		try {
			
			con = DataSourceFactory.getConnection();
			IInvAssetsDAO ivnAssetsDAO = new InvAssetsDAO(con);
			
			return ivnAssetsDAO.getAll();
			
		} catch (DAOException e) {
			throw new LogicaException(e);
		} finally {
			DataSourceFactory.desconectar(con);
		}
	}
	
	public boolean update(InvAssetsBean iAssets) throws LogicaException {
		Connection con = null;
		try {
			con = DataSourceFactory.getConnection();
			
			IInvAssetsDAO ivnAssetsDAO = new InvAssetsDAO(con);
			
			boolean sw = ivnAssetsDAO.update(iAssets);
			
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

}
