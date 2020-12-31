package com.ivote.dao;

import java.util.List;

import com.ivote.bean.Admin;
import com.ivote.bean.Party;

public interface PartyDao extends GenericDAO<Party> {

	public Party saveUpdateParty(Party party);

	public Party editParty(long id);

	public boolean deleteParty(long id);

	public List<Party> getAll();
	
	public List<Party> getAllWithLeader();

}
