package com.ivote.service;

import java.util.List;

import com.ivote.bean.Mapping;
import com.ivote.bean.Vote;

public interface MappingService {

	public long saveUpdateMapping(Mapping ad);
	public Mapping editMapping(long id);
	public boolean deleteMapping(long id);
	public List<Mapping> getAll();
}
