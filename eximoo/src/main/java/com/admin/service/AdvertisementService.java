package com.admin.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.admin.model.Advertisement;

public interface AdvertisementService {
		
	public long saveUpdateAd(Advertisement advertisement, MultipartFile file);
	public Advertisement editAdvertisement(long advertisementId);
	public boolean deleteAdvertisement(long advertisementId);
	public List<Advertisement> getAll();
}
