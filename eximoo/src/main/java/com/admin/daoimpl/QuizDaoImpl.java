package com.admin.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.admin.dao.QuizDao;
import com.admin.model.QuizDetail;

@Repository("quizDao")
public class QuizDaoImpl extends GenericDaoImpl<QuizDetail> implements QuizDao {
	protected static SessionFactory sessionFactory;
	
	public int saveUpdateQuiz(QuizDetail detail) {
		return super.saveUpdateObject(detail).getQuizId();
	}

	

}
