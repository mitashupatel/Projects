package com.admin.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.dao.UserDao;
import com.admin.model.Admin;
import com.admin.model.NewsLetter;
import com.admin.model.User;


@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	protected static SessionFactory sessionFactory;

	public long saveUpdateUser(User user) {
		return super.saveUpdateObject(user).getUserid();
	}

	public User editUser(long userid) {
		return super.getById(User.class, userid);
	}

	public boolean deleteUser(long userid) {
		User user = super.getById(User.class, userid);
		user.setIsDeleted(1);
		return super.updateObject(user).getUserid() > 0;
	}

	public List<User> getAll() {
		return (List<User>) super.getByQuery("FROM User a WHERE isDeleted=0");
	}

	public User logincheck(User user) {
		String query = "FROM User where email='" + user.getEmail() + "' and password='" + user.getPassword() + "'";
		List<User> list = super.getByQuery(query);
		if (list.size() == 0) {
			return null;
		}
		return list.get(0);
	}

	public List<User> getIdList() {
		return (List<User>) super.getByQuery("SELECT userid FROM User  a WHERE isDeleted=0");
	}

	public User forgotpassword(User user) {

		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("email", user.getEmail()));
		User userDao = (User) criteria.uniqueResult();
		return userDao;
	}

	public int changePass(String newPassword, long id) {
		String query = "update User set password = '" + newPassword + "' where userid ='" + id + "'";
		int count = super.updateByQuery(query);
		return count;
	}

	public int updatePass(String oldpassword, String newpassword) {
		String query = "FROM User where password='" + oldpassword + "'";
		return 0;
	}

	public boolean isEmailExist(String email) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("email", email));
		User user1 = (User) criteria.uniqueResult();
		return (user1 != null);
	}

}
