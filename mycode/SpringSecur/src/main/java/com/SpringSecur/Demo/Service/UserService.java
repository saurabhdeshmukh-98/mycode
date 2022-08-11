package com.SpringSecur.Demo.Service;

import java.util.List;

import com.SpringSecur.Demo.Entity.User;

public interface UserService {

	public User insert(User user);
	
	public List<User> getAllUser();
	
	public String userName(int id);
}
