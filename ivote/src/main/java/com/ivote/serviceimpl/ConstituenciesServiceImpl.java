package com.ivote.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ivote.bean.Constituencies;
import com.ivote.bean.Regions;
import com.ivote.service.ConstituenciesService;
import com.ivote.dao.*;

@Service("constituenciesService")
@Transactional
public class ConstituenciesServiceImpl implements ConstituenciesService {

	@Autowired
	ConstituenciesDao constituenciesDao;
	
	@Autowired
	RegionsDao regionsDao;
	
	public long saveUpdateConstituencies(Constituencies constituencies) {
		constituencies.setIsActive(1);
		Constituencies constituencies1 = constituenciesDao.saveUpdateConstituencies(constituencies);
		return 0;
	}

	public Constituencies editConstituencies(long id) {
		return constituenciesDao.editConstituencies(id);
	}

	public boolean deleteConstituencies(long id) {
		
		return constituenciesDao.deleteConstituencies(id);
	}

	public List<Constituencies> getAll() {
		List<Constituencies> constituenciesList = constituenciesDao.getAll();
		return constituenciesList;
	}

	public List<Constituencies> getAllConsByRegionId(long id) {
		return constituenciesDao.getAllConsByRegionId(id);
	}
	
}
