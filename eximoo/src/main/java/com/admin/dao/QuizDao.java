package com.admin.dao;

import com.admin.daoimpl.GenericDaoImpl;

import com.admin.model.QuizDetail;
import com.admin.model.User;


public interface QuizDao extends GenericDAO<QuizDetail> {
	public int saveUpdateQuiz(QuizDetail detail);

}
