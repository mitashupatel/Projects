package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ivote.bean.Election;
import com.ivote.dao.ElectionDao;

@Repository("ElectionDao")
public class ElectionDaoImpl extends GenericDaoImpl<Election> implements ElectionDao {

	public Election saveUpdateElection(Election Election) {
		return super.saveUpdateObject(Election);
	}

	public Election editElection(long id) {
		return super.getById(Election.class, id);
	}

	public List<Election> getAll() {
		return (List<Election>) super.getByQuery("FROM Election a WHERE a.isDeleted=0");
	}

	public boolean deleteElection(long id) {
		Election Election = super.getById(Election.class, id);
		Election.setIsDeleted(1);
		return super.updateObject(Election).getElectionId() > 0;
	}
}
