package com.admin.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.admin.dao.AdvertisementDao;
import com.admin.model.Admin;
import com.admin.model.Advertisement;

@Repository("advertisementDao")
public class AdvertisementDaoImpl extends GenericDaoImpl<Advertisement> implements AdvertisementDao{

	public long saveUpdateAd(Advertisement advertisement) {
		return super.saveUpdateObject(advertisement).getAdvertisementId();
	}

	public List<Advertisement> getAll() {
		return (List<Advertisement>) super.getByQuery("FROM Advertisement a WHERE isDeleted=0");
	}

	public Advertisement editAdvertisement(long advertisementId) {
		return super.getById(Advertisement.class, advertisementId);
	}

	public boolean deleteAdvertisement(long advertisementId) {
		Advertisement advertisement= super.getById(Advertisement.class, advertisementId);
		advertisement.setIsDeleted(1);
		return super.updateObject(advertisement).getAdvertisementId()> 0;
	}
		
}
