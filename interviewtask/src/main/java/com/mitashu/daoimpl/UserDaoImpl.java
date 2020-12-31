package com.mitashu.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mitashu.dao.UserDao;
import com.mitashu.model.User;

@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao{

	public long saveUpdateUser(User user) {
		return super.saveUpdateObject(user).getUserId();
		
	}

	public User editUser(long userId) {
		return super.getById(User.class, userId);
	}

	public boolean deleteUser(long userId) {
		User user= super.getById(User.class, userId);
		user.setIsDeleted(1);
		return super.updateObject(user).getUserId()> 0;
	}

	public List<User> getAll() {
		return (List<User>) super.getByQuery("FROM User a WHERE isDeleted=0");
	}

}
