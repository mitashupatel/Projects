package com.admin.dao;

import java.util.List;
import com.admin.model.Feedback;

public interface AdminsideFeedbackDao extends GenericDAO<Feedback>{
		
	public List<Feedback> getAll();
}
