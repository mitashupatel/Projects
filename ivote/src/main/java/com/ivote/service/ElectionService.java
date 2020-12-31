package com.ivote.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ivote.bean.Election;

public interface ElectionService {

	public long saveUpdateElection(Election ad, MultipartFile[] file);
	public Election editElection(long id);
	public boolean deleteElection(long id);
	public List<Election> getAll();
}
