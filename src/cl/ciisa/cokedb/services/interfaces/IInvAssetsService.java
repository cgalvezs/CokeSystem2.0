package cl.ciisa.cokedb.services.interfaces;

import java.util.ArrayList;

import cl.ciisa.cokedb.model.InvAssetsBean;
import cl.ciisa.cokedb.services.impl.LogicaException;

public interface IInvAssetsService {
	public long insert(InvAssetsBean iAssets) throws LogicaException;
	public ArrayList<InvAssetsBean> getAll() throws LogicaException;
	public boolean update(InvAssetsBean iAssets) throws LogicaException;

}
