package com.ivote.dao;

import java.util.List;

import com.ivote.bean.Mapping;
import com.ivote.bean.Vote;

public interface MappingDao extends GenericDAO<Mapping> {

	public Mapping saveUpdateMapping(Mapping mapping);

	public Mapping editMapping(long id);

	public boolean deleteMapping(long id);

	public List<Mapping> getAll();


}
