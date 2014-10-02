package cl.ciisa.cokedb.services.interfaces;

import java.util.ArrayList;

import cl.ciisa.cokedb.model.ItAssetsBean;
import cl.ciisa.cokedb.services.impl.LogicaException;

public interface IItAssetsService {
	public ArrayList<ItAssetsBean> getAssetsIdName() throws LogicaException;
	public boolean update(ItAssetsBean iassets) throws LogicaException;
	public ArrayList<ItAssetsBean> getAll() throws LogicaException;
	public long insert(ItAssetsBean iassets) throws LogicaException;
}
