package com.ivote.dao;

import java.util.List;
import com.ivote.bean.Vote;

public interface VoteDao extends GenericDAO<Vote> {

	public Vote saveUpdateVote(Vote vote);

	public Vote editVote(long id);

	public boolean deleteVote(long id);

	public List<Vote> getAll();
	
	public List<Vote> getAllMPs(int id);
	
	public List<Vote> getVoteCounter(int id);


}
