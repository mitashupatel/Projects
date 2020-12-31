package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.ivote.bean.Admin;
import com.ivote.bean.Mapping;
import com.ivote.bean.Party;
import com.ivote.bean.Vote;
import com.ivote.dao.MappingDao;
import com.ivote.dao.VoteDao;
import com.ivote.utils.DbUtility;

@Repository("mappingDao")
public class MappingDaoImpl extends GenericDaoImpl<Mapping> implements MappingDao {

	public Mapping saveUpdateMapping(Mapping mapping) {
		return super.saveUpdateObject(mapping);
	}

	public Mapping editMapping(long id) {
		return super.getById(Mapping.class, id);
	}

	public List<Mapping> getAll() {
		String query = "select m.*, e.electionName, p.partyName, mp.firstName as mpFirstName, "
				+ "mp.lastName as mpLastName, l.firstName as leaderFirstName, "
				+ "l.lastName as leaderLastName, n.nationName, r.regionName, c.constituencyName "
				+ "from mapping m inner join elections e on m.electionId = e.electionId "
				+ "inner join party p on m.partyId = p.partyId "
				+ "inner join leaders l on p.leaderId = l.leaderId "
				+ "inner join nations n on m.nationId = n.nationId "
				+ "inner join regions r on m.regionId = r.regionId "
				+ "inner join constituencies c on m.constituencyId = c.constituencyId "
				+ "inner join mps mp on m.mpId = mp.mpId where m.isDeleted = 0";
		//return (List<Mapping>) super.getByQuery("FROM Mapping a WHERE a.isDeleted=0");
		return DbUtility.getListData(query, Mapping.class);
	}

	public boolean deleteMapping(long id) {
		Mapping mapping = super.getById(Mapping.class, id);
		mapping.setIsDeleted(1);
		return super.updateObject(mapping).getMappingId() > 0;
	}
}
