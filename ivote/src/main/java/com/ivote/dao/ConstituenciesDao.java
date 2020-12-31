package com.ivote.dao;

import java.util.List;

import com.ivote.bean.Admin;
import com.ivote.bean.Constituencies;
import com.ivote.bean.Regions;

public interface ConstituenciesDao extends GenericDAO<Constituencies> {

	public Constituencies saveUpdateConstituencies(Constituencies constituencies);

	public Constituencies editConstituencies(long id);

	public boolean deleteConstituencies(long id);

	public List<Constituencies> getAll();
	
	public List<Constituencies> getAllConsByRegionId(long nationId);


}
