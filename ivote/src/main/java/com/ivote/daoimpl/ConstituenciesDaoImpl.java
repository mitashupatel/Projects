package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.ivote.bean.Constituencies;
import com.ivote.bean.Regions;
import com.ivote.dao.ConstituenciesDao;
import com.ivote.utils.DbUtility;

@Repository("constituenciesDao")
public class ConstituenciesDaoImpl extends GenericDaoImpl<Constituencies> implements ConstituenciesDao {

	public Constituencies saveUpdateConstituencies(Constituencies constituencies) {
		return super.saveUpdateObject(constituencies);
	}

	public Constituencies editConstituencies(long id) {
		return super.getById(Constituencies.class, id);
	}

	public List<Constituencies> getAll() {
		String query = "SELECT c.constituencyId, c.constituencyName, n.nationId, n.nationName, r.regionId, r.regionName FROM constituencies c INNER JOIN nations n ON c.nationId = n.nationId INNER JOIN regions r ON c.regionId = r.regionId WHERE c.isDeleted = 0"; 
		return DbUtility.getListData(query, Constituencies.class);
	}

	public boolean deleteConstituencies(long id) {
		Constituencies Constituencies = super.getById(Constituencies.class, id);
		Constituencies.setIsDeleted(1);
		return super.updateObject(Constituencies).getConstituencyId() > 0;
	}

	public List<Constituencies> getAllConsByRegionId(long id) {
		String query = "SELECT * FROM constituencies c WHERE c.isDeleted = 0 AND c.regionId ="+id; 
		return DbUtility.getListData(query, Constituencies.class);
	}
}
