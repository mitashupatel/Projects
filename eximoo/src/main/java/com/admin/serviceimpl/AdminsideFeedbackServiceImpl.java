package com.admin.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.admin.dao.AdminsideFeedbackDao;
import com.admin.model.Feedback;
import com.admin.service.AdminsideFeedbackService;

@Service("adminfeedbackService")
@Transactional
@SessionAttributes("admin")
public class AdminsideFeedbackServiceImpl implements AdminsideFeedbackService{
			
	@Autowired
	AdminsideFeedbackDao adminfeedbackDao;
		
	public List<Feedback> getAll() {
		List<Feedback> feedbackList = adminfeedbackDao.getAll();
		
		return feedbackList;
	}
}
