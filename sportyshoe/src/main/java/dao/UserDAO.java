package dao;

import java.util.List;

import entity.User;

 

public interface UserDAO {
	
	public List<User> getUsers();
	
	public User getUser(int user);
	
	public void saveUser(User user);
	
	public void deleteUser(int user);

}



