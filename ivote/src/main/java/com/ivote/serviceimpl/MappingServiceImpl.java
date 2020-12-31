package com.ivote.serviceimpl;

import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ivote.bean.Mapping;
import com.ivote.bean.Vote;
import com.ivote.dao.MappingDao;
import com.ivote.dao.VoteDao;
import com.ivote.service.MappingService;
import com.ivote.service.VoteService;

@Service("mappingService")
@Transactional
public class MappingServiceImpl implements MappingService {

	@Autowired
	MappingDao mappingDao;
	
	public long saveUpdateMapping(Mapping mapping) {
		mapping = mappingDao.saveUpdateMapping(mapping);
		return 0;
	}

	public Mapping editMapping(long id) {
		return mappingDao.editMapping(id);
	}

	public boolean deleteMapping(long id) {
		
		return mappingDao.deleteMapping(id);
	}

	public List<Mapping> getAll() {
		List<Mapping> mappingList = mappingDao.getAll();
		return mappingList;
	}

}
