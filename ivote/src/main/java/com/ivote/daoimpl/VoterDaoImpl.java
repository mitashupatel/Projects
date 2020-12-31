package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.ivote.bean.Admin;
import com.ivote.bean.Voter;
import com.ivote.dao.VoterDao;

@Repository("VoterDao")
public class VoterDaoImpl extends GenericDaoImpl<Voter> implements VoterDao {

	public Voter saveUpdateVoter(Voter Voter) {
		return super.saveUpdateObject(Voter);
	}

	public Voter editVoter(long id) {
		return super.getById(Voter.class, id);
	}

	public List<Voter> getAll() {
		return (List<Voter>) super.getByQuery("FROM Voter a WHERE a.isDeleted=0");
	}

	public boolean deleteVoter(long id) {
		Voter voter = super.getById(Voter.class, id);
		voter.setIsDeleted(1);
		return super.updateObject(voter).getVoterId() > 0;
	}
}
