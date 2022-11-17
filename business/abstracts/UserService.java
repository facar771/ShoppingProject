package projects.shoppingSite.business.abstracts;

import projects.shoppingSite.entities.User;

public interface UserService {
	void signIn(User user);
	void login(User user);
}
