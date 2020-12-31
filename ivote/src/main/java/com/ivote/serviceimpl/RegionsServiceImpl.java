package com.ivote.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ivote.bean.Regions;
import com.ivote.dao.RegionsDao;
import com.ivote.service.RegionsService;

@Service("regionsService")
@Transactional
public class RegionsServiceImpl implements RegionsService {

	@Autowired
	RegionsDao regionsDao;
	
	public long saveUpdateRegions(Regions regions) {
		Regions regions1 = regionsDao.saveUpdateRegions(regions);
		return 0;
	}

	public Regions editRegions(long id) {
		return regionsDao.editRegions(id);
	}

	public boolean deleteRegions(long id) {
		
		return regionsDao.deleteRegions(id);
	}

	public List<Regions> getAll() {
		List<Regions> regionsList = regionsDao.getAll();
		return regionsList;
	}

	public List<Regions> getAllRegionsByNationId(long nationId) {
		// TODO Auto-generated method stub
		return regionsDao.getAllRegionsByNationId(nationId);
	}

}
