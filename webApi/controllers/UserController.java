package projects.shoppingSite.webApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.shoppingSite.business.abstracts.UserService;
import projects.shoppingSite.business.abstracts.asdads;
import projects.shoppingSite.entities.User;

@RestController
@RequestMapping("api/users")
public class UserController {
	
	public void bok() {
		asdads asdads = new asdads();
		asdads.add();
	}
	
//	private UserService userService;
//	
//	@Autowired
//	public UserController(UserService userServise) {
//		this.userService = userServise;
//	}
//	
//	@PostMapping("/singin")
//	void signIn(User user) {
//		userService.signIn(user);
//	}
//	
//	@PostMapping("/login")
//	void login(User user) {
//		userService.login(user);
//	}
}
