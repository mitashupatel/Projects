package com.ivote.dao;

import java.util.List;
import com.ivote.bean.Vote;
import com.ivote.bean.Voter;

public interface VoterDao extends GenericDAO<Voter> {

	public Voter saveUpdateVoter(Voter voter);

	public Voter editVoter(long id);

	public boolean deleteVoter(long id);

	public List<Voter> getAll();


}
