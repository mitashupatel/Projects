package com.ivote.daoimpl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ivote.bean.Admin;
import com.ivote.bean.Party;
import com.ivote.dao.AdminDao;
import com.ivote.dao.PartyDao;
import com.ivote.utils.DbUtility;

@Repository("partyDao")
public class PartyDaoImpl extends GenericDaoImpl<Party> implements PartyDao {

	public Party saveUpdateParty(Party party) {
		return super.saveUpdateObject(party);
	}

	public Party editParty(long id) {
		return super.getById(Party.class, id);
	}

	public boolean deleteParty(long id) {
		Party party = super.getById(Party.class, id);
		party.setIsDeleted(1);
		return super.updateObject(party).getPartyId() > 0;
	}

	public List<Party> getAllWithLeader() {
		String query = "Select p.*, l.leaderId, l.firstName as leaderFirstName, l.lastName as leaderLastName, l.leaderImage from party p inner join leaders l on p.leaderId = l.leaderId where p.isDeleted = 0";
		//return (List<Party>) super.getByQuery("FROM Party a WHERE a.isDeleted=0");
		return DbUtility.getListData(query, Party.class);
	}
	
	public List<Party> getAll() {
		return (List<Party>) super.getByQuery("FROM Party a WHERE a.isDeleted=0");
	}
}
