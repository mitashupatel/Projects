package com.ivote.service;

import java.util.List;

import com.ivote.bean.Nations;

public interface NationsService {

	public long saveUpdateNations(Nations ad);
	public Nations editNations(long id);
	public boolean deleteNations(long id);
	public List<Nations> getAll();
}
