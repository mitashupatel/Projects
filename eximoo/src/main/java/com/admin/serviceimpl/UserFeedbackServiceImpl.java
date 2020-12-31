package com.admin.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.UserFeedbackDao;

import com.admin.model.Feedback;
import com.admin.service.UserFeedbackService;
@Service("feedbackService")
@Transactional
public class UserFeedbackServiceImpl implements UserFeedbackService {
	
		@Autowired
		UserFeedbackDao feedbackDao;
		
		public long saveUpdateFeedback(Feedback feedback) {
			feedback.setIsActive(1);
			long feedbackId = 0;
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			feedback.setAddingdate(formatter.format(date));
			feedbackDao.saveUpdateFeedback(feedback);

			return feedbackId;
		}
}	
