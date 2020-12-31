package com.ivote.dao;

import java.util.List;
import com.ivote.bean.Leader;

public interface LeaderDao extends GenericDAO<Leader> {

	public Leader saveUpdateLeader(Leader leader);

	public Leader editLeader(long id);

	public boolean deleteLeader(long id);

	public List<Leader> getAll();


}
