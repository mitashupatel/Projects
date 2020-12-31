package com.admin.daoimpl;

import org.springframework.stereotype.Repository;

import com.admin.dao.UserFeedbackDao;
import com.admin.model.Contact;
import com.admin.model.Feedback;
import com.admin.service.UserFeedbackService;

@Repository("feedbackDao")
public class UserFeedbackDaoImpl extends GenericDaoImpl<Feedback> implements UserFeedbackDao{
	
	public long saveUpdateFeedback(Feedback feedback) {
		return super.saveUpdateObject(feedback).getFeedbackId();
	}
}
