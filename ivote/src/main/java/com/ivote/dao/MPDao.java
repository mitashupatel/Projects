package com.ivote.dao;

import java.util.List;
import com.ivote.bean.MP;

public interface MPDao extends GenericDAO<MP> {

	public MP saveUpdateMP(MP mp);

	public MP editMP(long id);

	public boolean deleteMP(long id);

	public List<MP> getAll();


}
