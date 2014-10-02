package cl.ciisa.cokedb.services.interfaces;

import java.util.ArrayList;

import cl.ciisa.cokedb.dao.impl.DAOException;
import cl.ciisa.cokedb.model.UserListBean;
import cl.ciisa.cokedb.services.impl.LogicaException;



public interface IUserListService {
	
	public ArrayList<UserListBean> getAll() throws LogicaException;
	public boolean update(UserListBean userlist) throws LogicaException;
	public long insert(UserListBean ulist) throws LogicaException;
	public ArrayList<UserListBean> getUserNameAndId() throws LogicaException;
	public ArrayList<UserListBean> getUser(int pk) throws LogicaException;

}
