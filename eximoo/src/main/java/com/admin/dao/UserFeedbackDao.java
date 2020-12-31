package com.admin.dao;


import com.admin.model.Feedback;


public interface UserFeedbackDao extends GenericDAO<Feedback>{
	
	public long saveUpdateFeedback(Feedback feedback);
}
