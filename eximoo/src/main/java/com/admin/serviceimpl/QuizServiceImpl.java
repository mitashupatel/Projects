package com.admin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.QuizDao;

import com.admin.model.QuizDetail;
import com.admin.service.QuizService;

@Service("quizService")
public class QuizServiceImpl implements QuizService{
   @Autowired
   QuizDao quizDao;
	public int saveUpdateQuiz(QuizDetail detail) {
		 int quizId=0;
		return quizId = quizDao.saveUpdateQuiz(detail);
	  
	}
	
}
