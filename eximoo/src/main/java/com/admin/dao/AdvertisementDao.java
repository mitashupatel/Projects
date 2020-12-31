package com.admin.dao;

import java.util.List;


import com.admin.model.Advertisement;

public interface AdvertisementDao extends GenericDAO<Advertisement> {
			
	public long saveUpdateAd(Advertisement advertisement);
	
	public Advertisement editAdvertisement(long advertisementId);
	
	public boolean deleteAdvertisement(long advertisementId);
	
	public List<Advertisement> getAll();
}
