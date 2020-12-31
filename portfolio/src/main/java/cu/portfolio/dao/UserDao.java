package cu.portfolio.dao;

import java.util.List;

import cu.portfolio.model.User;

public interface UserDao {
	
	public User saveUser(User user);
	public User editUser(int id);
	public int deleteUser(int id);
	public List<User> getAll();

	
}
