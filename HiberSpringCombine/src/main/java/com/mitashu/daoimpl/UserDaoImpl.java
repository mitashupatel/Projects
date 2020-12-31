package com.mitashu.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mitashu.dao.UserDao;
import com.mitashu.model.User;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sf;
	
	public List<User> getAll() {
	Session s=sf.openSession();	
	Transaction t = s.beginTransaction();
	List<User> list = new ArrayList<User>();
	try {

		list = s.createQuery("FROM User").list();

		t.commit();
	} catch (Exception e) {
		t.rollback();
		e.printStackTrace();
	} finally {
		s.close();
	}	
		
		
	
		return list;
	}

	public long saveUser(User user) {
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		boolean result=false;
		int id=user.getId();
		if(id!=0) {
			try{
				
				ss.update(user);
				t.commit();
				result =true;
				}
			catch (Exception e) {
			t.rollback();	
			e.printStackTrace();	
			}
			finally {
			ss.close();
			}
			
			
		}
		else {
		try{
			
			ss.save(user);
			t.commit();
			result =true;
			}
		catch (Exception e) {
		t.rollback();	
		e.printStackTrace();	
		}
		finally {
		ss.close();
		}
		}
		return 0;
	}

	public User edituser(int id) {
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		User user=ss.get(User.class, id);
		t.commit();
		return user;
	}

	public int deleteUser(int id) {
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		boolean result=false;
		User user=ss.get(User.class, id);
		ss.delete(user);
		t.commit();
		return 0;
	}

}
