package com.ivote.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ivote.bean.Constituencies;
import com.ivote.bean.PostCode;
import com.ivote.bean.Regions;
import com.ivote.service.ConstituenciesService;
import com.ivote.service.PostCodeService;
import com.ivote.dao.*;

@Service("postCodeService")
@Transactional
public class PostCodeServiceImpl implements PostCodeService {

	@Autowired
	PostCodeDao postCodeDao;
	
	@Autowired
	RegionsDao regionsDao;
	
	public long saveUpdatePostCode(PostCode postCode) {
		postCode.setIsActive(1);
		PostCode postCode1 = postCodeDao.saveUpdatePostCode(postCode);
		return 0;
	}

	public PostCode editPostCode(long id) {
		return postCodeDao.editPostCode(id);
	}

	public boolean deletePostCode(long id) {
		
		return postCodeDao.deletePostCode(id);
	}

	public List<PostCode> getAll() {
		List<PostCode> postCodeList = postCodeDao.getAll();
		return postCodeList;
	}

}
