package com.ivote.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ivote.bean.Nations;
import com.ivote.dao.NationsDao;
import com.ivote.service.NationsService;

@Service("nationService")
@Transactional
public class NationsServiceImpl implements NationsService {

	@Autowired
	NationsDao nationsDao;
	
	public long saveUpdateNations(Nations nations) {
		Nations nations1 = nationsDao.saveUpdateNations(nations);
		return 0;
	}

	public Nations editNations(long id) {
		return nationsDao.editNations(id);
	}

	public boolean deleteNations(long id) {
		
		return nationsDao.deleteNations(id);
	}

	public List<Nations> getAll() {
		List<Nations> nationsList = nationsDao.getAll();
		return nationsList;
	}
}
