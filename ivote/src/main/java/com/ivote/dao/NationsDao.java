package com.ivote.dao;

import java.util.List;
import com.ivote.bean.Nations;

public interface NationsDao extends GenericDAO<Nations> {

	public Nations saveUpdateNations(Nations nations);

	public Nations editNations(long id);

	public boolean deleteNations(long id);

	public List<Nations> getAll();


}
