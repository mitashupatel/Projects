package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ivote.bean.Regions;
import com.ivote.dao.RegionsDao;
import com.ivote.utils.DbUtility;

@Repository("RegionsDao")
public class RegionsDaoImpl extends GenericDaoImpl<Regions> implements RegionsDao {

	public Regions saveUpdateRegions(Regions Regions) {
		return super.saveUpdateObject(Regions);
	}

	public Regions editRegions(long id) {
		return super.getById(Regions.class, id);
	}

	public List<Regions> getAll() {
		String query = "SELECT r.regionId, r.regionName, n.nationId, n.nationName FROM regions r INNER JOIN nations n ON r.nationId = n.nationId WHERE r.isDeleted = 0"; 
		return DbUtility.getListData(query, Regions.class);
	}
	
	public List<Regions> getAllRegionsByNationId(long nationId) {
		String query = "SELECT * FROM regions r WHERE r.isDeleted = 0 AND r.nationId ="+nationId; 
		return DbUtility.getListData(query, Regions.class);
	}

	public boolean deleteRegions(long id) {
		Regions Regions = super.getById(Regions.class, id);
		Regions.setIsDeleted(1);
		return super.updateObject(Regions).getRegionId() > 0;
	}
}
