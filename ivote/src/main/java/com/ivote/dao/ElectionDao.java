package com.ivote.dao;

import java.util.List;
import com.ivote.bean.Election;

public interface ElectionDao extends GenericDAO<Election> {

	public Election saveUpdateElection(Election election);

	public Election editElection(long id);

	public boolean deleteElection(long id);

	public List<Election> getAll();


}
