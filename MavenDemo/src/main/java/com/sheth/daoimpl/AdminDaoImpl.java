package com.sheth.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sheth.dao.AdminDao;
import com.sheth.model.Admin;

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

	public Admin updateAdmin(Admin admin) {
		getSession().update(admin);
		return null;
	}

	public Admin editAdmin(int id) {
		Admin admin = getSession().get(Admin.class, id);
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
		//Criteria criteria = getSession().createCriteria(Admin.class);
		//return criteria.list();
		
		String query = "from Admin where isdeleted = 0";
		Query queryResult = getSession().createQuery(query);
		return queryResult.list();
	}

}
