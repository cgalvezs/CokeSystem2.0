package cl.ciisa.cokedb.services.interfaces;

import java.util.ArrayList;

import cl.ciisa.cokedb.model.AssetsTipoBean;
import cl.ciisa.cokedb.services.impl.LogicaException;

public interface IAssetsTipoService {
	
	public void delete(long id) throws LogicaException;
	public boolean update(AssetsTipoBean adesc) throws LogicaException;
	public ArrayList<AssetsTipoBean> getAll() throws LogicaException;
	public long insert(AssetsTipoBean atipo) throws LogicaException;

}
