package cl.ciisa.cokedb.services.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import cl.ciisa.cokedb.dao.impl.DAOException;
import cl.ciisa.cokedb.dao.impl.DataSourceFactory;
import cl.ciisa.cokedb.dao.impl.UserListDAO;
import cl.ciisa.cokedb.dao.interfaces.IUserListDAO;
import cl.ciisa.cokedb.model.UserListBean;
import cl.ciisa.cokedb.services.impl.LogicaException;
import cl.ciisa.cokedb.services.interfaces.IUserListService;


public class UserListService implements IUserListService{
	
	public long insert(UserListBean ulist) throws LogicaException{
		Connection con = null;
		try {
			
			con = DataSourceFactory.getConnection();
			
			IUserListDAO userListDAO = new UserListDAO(con);
			
			long pkUsuario = userListDAO.insert(ulist);
			
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
	
	public ArrayList<UserListBean> getAll() throws LogicaException{
		Connection con = null;
		try {
			
			con = DataSourceFactory.getConnection();
			IUserListDAO centCostDAO = new UserListDAO(con);
			
			return centCostDAO.getAll();
			
		} catch (DAOException e) {
			throw new LogicaException(e);
		} finally {
			DataSourceFactory.desconectar(con);
		}
	}
	
	public boolean update(UserListBean userlist) throws LogicaException {
		Connection con = null;
		try {
			con = DataSourceFactory.getConnection();
			
			IUserListDAO centCostDAO = new UserListDAO(con);
			
			boolean sw = centCostDAO.update(userlist);
			
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
	
	public ArrayList<UserListBean> getUserNameAndId() throws LogicaException{
		Connection con = null;
		try {
			
			con = DataSourceFactory.getConnection();
			IUserListDAO centCostDAO = new UserListDAO(con);
			
			return centCostDAO.getUserNameAndId();
			
		} catch (DAOException e) {
			throw new LogicaException(e);
		} finally {
			DataSourceFactory.desconectar(con);
		}
	}
	
	public ArrayList<UserListBean> getUser(int pk) throws LogicaException{
		
		Connection con = null;
		try {
			
			con = DataSourceFactory.getConnection();
			IUserListDAO userListtDAO = new UserListDAO(con);
			
			return userListtDAO.getUser(pk);
			
		} catch (DAOException e) {
			throw new LogicaException(e);
		} finally {
			DataSourceFactory.desconectar(con);
		}
	}
	
	

}
