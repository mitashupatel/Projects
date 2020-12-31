package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.ivote.bean.Admin;
import com.ivote.bean.Mapping;
import com.ivote.bean.Vote;
import com.ivote.dao.VoteDao;
import com.ivote.utils.DbUtility;

@Repository("VoteDao")
public class VoteDaoImpl extends GenericDaoImpl<Vote> implements VoteDao {

	public Vote saveUpdateVote(Vote Vote) {
		return super.saveUpdateObject(Vote);
	}

	public Vote editVote(long id) {
		return super.getById(Vote.class, id);
	}

	public List<Vote> getAll() {
		return (List<Vote>) super.getByQuery("FROM Vote a WHERE a.isDeleted=0");
	}

	public boolean deleteVote(long id) {
		Vote Vote = super.getById(Vote.class, id);
		return super.updateObject(Vote).getVoteId() > 0;
	}

	public List<Vote> getAllMPs(int id) {
		String query = "select v.voterId, v.pincode, post.constituencyId, c.constituencyName,"
				+ " mp.firstName as mpFirstName, mp.mpId, mp.lastName as mpLastName, mp.mpImage,"
				+ " p.partyId, p.partyName, p.partyImage, m.electionId, l.leaderId, l.firstName as leaderFirstName,"
				+ " l.lastName as leaderLastName, l.leaderImage from Voter v "
				+ "Inner join postcode post on v.pincode = post.postcodeName "
				+ "Inner join constituencies c on post.constituencyId = c.constituencyId "
				+ "inner join mapping m on post.constituencyId = m.constituencyId "
				+ "inner join mps mp on m.mpid = mp.mpid inner join party p on m.partyid = p.partyId "
				+ "inner join leaders l on p.leaderId = l.leaderId where voterId = "+id;
		return DbUtility.getListData(query, Vote.class);
	}
	
	public List<Vote> getVoteCounter(int id) {
		String query = "select count(*) as voteCount, p.partyId, p.partyName, p.partyImage from vote vote inner join party p on vote.partyId = p.partyId where electionId = "+id+" group by partyId";
		return DbUtility.getListData(query, Vote.class);
	}
}
