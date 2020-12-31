package com.ivote.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ivote.bean.Admin;
import com.ivote.bean.User;
import com.ivote.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	public long saveUpdateUser(User user) {
		return super.saveUpdateObject(user).getUserId();
	}

	public User editUser(long id) {
		return super.getById(User.class, id);
	}

	public boolean deleteUser(long id) {
		User user = super.getById(User.class, id);
		user.setIsDeleted(1);
		return super.updateObject(user).getUserId() > 0;
	}

	public List<User> getAll() {
		return (List<User>) super.getByQuery("FROM User a WHERE a.isDeleted=0");
	}

}
