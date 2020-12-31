package cu.portfolio.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import cu.portfolio.dao.UserDao;
import cu.portfolio.model.User;

@Repository("userDao")
public class UserDaoimpl implements UserDao {

	protected static SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public User saveUser(User user) {
		Session session = null;
		
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.saveOrUpdate(user);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			 if (session != null && session.isOpen()) session.close();
		}
		return user;
	}

	public User editUser(int id) {
		User user=getSession().get(User.class,id);
		return user;
	}

	public int deleteUser(int id) {
		User user= getSession().get(User.class, id);
		user.setIsDeleted(1);
		
		Session session = null;
		Transaction tx = null;
		try {
			session = getSession();
			tx = session.beginTransaction();
			session.update(user);
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

	public List<User> getAll() {
		String  query="from User where isDeleted = 0";
		Query queryresult=getSession().createQuery(query);
		
		return queryresult.list();
		
	}
	
}
