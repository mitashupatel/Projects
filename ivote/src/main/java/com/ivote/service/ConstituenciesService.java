package com.ivote.service;

import java.util.List;
import com.ivote.bean.Constituencies;
import com.ivote.bean.Regions;

public interface ConstituenciesService {

	public long saveUpdateConstituencies(Constituencies ad);
	public Constituencies editConstituencies(long id);
	public boolean deleteConstituencies(long id);
	public List<Constituencies> getAll();
	public List<Constituencies> getAllConsByRegionId(long id);
	
}
