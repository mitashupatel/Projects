package com.ivote.service;

import java.util.List;

import com.ivote.bean.Regions;

public interface RegionsService {

	public long saveUpdateRegions(Regions ad);
	public Regions editRegions(long id);
	public boolean deleteRegions(long id);
	public List<Regions> getAll();
	public List<Regions> getAllRegionsByNationId(long nationId);

}
