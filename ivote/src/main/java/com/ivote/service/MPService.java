package com.ivote.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ivote.bean.MP;

public interface MPService {

	public long saveUpdateMP(MP ad, MultipartFile file);
	public MP editMP(long id);
	public boolean deleteMP(long id);
	public List<MP> getAll();
}
