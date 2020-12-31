package com.mitashu.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mitashu.dao.AdminDao;
import com.mitashu.model.Admin;


@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

	protected static SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	protected Session getSession() {
		return sessionFactory.openSession();
	}
	
	public Admin saveAdmin(Admin admin) {
		
		Session session = null;
		
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.saveOrUpdate(admin);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			 if (session != null && session.isOpen()) session.close();
		}
		return admin;
	}


	public Admin editAdmin(int id) {
		Admin admin=getSession().get(Admin.class,id);
		return admin;
	}

	public int deleteAdmin(int id) {
		
		Admin admin = getSession().get(Admin.class, id);
		admin.setIsDeleted(1);
		
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.update(admin);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			 if (session != null && session.isOpen()) session.close();
		}
		return 0;
	}

	public List<Admin> getAll() {
       String query="from Admin where isDeleted = 0";
        Query queryresult =getSession().createQuery(query);
      
		return queryresult.list();
	}

}
