package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ivote.bean.Leader;
import com.ivote.dao.LeaderDao;

@Repository("LeaderDao")
public class LeaderDaoImpl extends GenericDaoImpl<Leader> implements LeaderDao {

	public Leader saveUpdateLeader(Leader Leader) {
		return super.saveUpdateObject(Leader);
	}

	public Leader editLeader(long id) {
		return super.getById(Leader.class, id);
	}

	public List<Leader> getAll() {
		return (List<Leader>) super.getByQuery("FROM Leader a WHERE a.isDeleted=0");
	}

	public boolean deleteLeader(long id) {
		Leader leader = super.getById(Leader.class, id);
		leader.setIsDeleted(1);
		return super.updateObject(leader).getLeaderId() > 0;
	}
}
