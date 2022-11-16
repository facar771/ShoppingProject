package projects.shoppingSite.webApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.shoppingSite.business.abstracts.UserServise;
import projects.shoppingSite.entities.User;

@RestController
@RequestMapping("api/users")
public class UserController {
	
	private UserServise userServise;
	
	@Autowired
	public UserController(UserServise userServise) {
		this.userServise = userServise;
	}
	
	@PostMapping("/singin")
	void signIn(User user) {
		userServise.signIn(user);
	}
	
	@PostMapping("/login")
	void login(User user) {
		userServise.login(user);
	}
}
