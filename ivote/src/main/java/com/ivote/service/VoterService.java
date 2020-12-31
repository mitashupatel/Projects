package com.ivote.service;

import java.util.List;

import com.ivote.bean.Vote;
import com.ivote.bean.Voter;

public interface VoterService {

	public long saveUpdateVoter(Voter ad);
	public Voter editVoter(long id);
	public boolean deleteVoter(long id);
	public List<Voter> getAll();
}
