package cu.portfolio.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.portfolio.dao.UserDao;
import cu.portfolio.model.User;
import cu.portfolio.service.UserService;

@Service("userService")
public class UserServiceimpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	public User saveUser(User user) {
		userDao.saveUser(user);
		return user;
	}

	public User editUser(int id) {
		User user=userDao.editUser(id);
		return user;
	}

	public int deleteUser(int id) {
		userDao.deleteUser(id);
		return 0;
	}

	public List<User> getAll() {
		List<User> list =userDao.getAll();
		return list;
	}

}
