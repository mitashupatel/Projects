package cu.portfolio.service;

import java.util.List;

import cu.portfolio.model.User;

public interface UserService {
	
	public User saveUser(User user);
	public User editUser(int id);
	public int deleteUser(int it);
	public List<User> getAll();
	
}
