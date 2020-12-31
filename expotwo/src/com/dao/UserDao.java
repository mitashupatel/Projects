package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.user;
import com.utill.SessionUtils;

public class UserDao {
	
	public List<user> getAll(){
		
		Session session=SessionUtils.getSession();
		Transaction t1=session.beginTransaction();
		List<user> list= new ArrayList<user>();
		
		list=session.createQuery("FROM user").list();
		t1.commit();
		
		session.close();
		return list;
		
	} 
	public boolean addUser(user bean) {
		
		Session session=SessionUtils.getSession();
		Transaction t1=session.beginTransaction();
		boolean result=false;
		
		session.save(bean);
		t1.commit();
		session.close();
		return true;
		
	}
}
