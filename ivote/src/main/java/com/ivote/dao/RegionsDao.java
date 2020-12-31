package com.ivote.dao;

import java.util.List;
import com.ivote.bean.Regions;

public interface RegionsDao extends GenericDAO<Regions> {

	public Regions saveUpdateRegions(Regions regions);

	public Regions editRegions(long id);

	public boolean deleteRegions(long id);

	public List<Regions> getAll();
	
	public List<Regions> getAllRegionsByNationId(long nationId);

}
