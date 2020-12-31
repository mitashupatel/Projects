package com.ivote.service;

import java.util.List;

import com.ivote.bean.Vote;

public interface VoteService {

	public long saveUpdateVote(Vote ad);
	public Vote editVote(long id);
	public boolean deleteVote(long id);
	public List<Vote> getAll();
	public List<Vote> getAllMPs(int id);
	public List<Vote> getVoteCounter(int id);
}
