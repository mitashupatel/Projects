package com.admin.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.admin.dao.AdminsideFeedbackDao;
import com.admin.model.Feedback;
@Repository("adminfeedbackDao")
public class AdminsideFeedbackDaoImpl extends GenericDaoImpl<Feedback> implements AdminsideFeedbackDao{
		
	public List<Feedback> getAll() {
		return (List<Feedback>) super.getByQuery("FROM Feedback a WHERE isDeleted=0");
	}
}	
