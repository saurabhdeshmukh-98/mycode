package com.SpringSecur.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecur.Demo.Entity.User;
import com.SpringSecur.Demo.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.insert(user);
	}

	@GetMapping("/getuser")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@GetMapping("/getname/{id}")
	public String userName(@PathVariable int id) {
		return userService.userName(id);
	//	return "get all name";
	}

}
