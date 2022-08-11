package com.SpringSecur.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringSecur.Demo.Dao.UserRepo;
import com.SpringSecur.Demo.Entity.User;
import com.SpringSecur.Demo.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userrepo;

	@Override
	public List<User> getAllUser() {
		return userrepo.findAll();
	}

	@Override
	public String userName(int id) {
        
		User user=userrepo.findById(id).get();
		return user.getUsername();
	}

	@Override
	public User insert(User user) {
		return userrepo.save(user);
	}
	
}
