package projects.shoppingSite.business.abstracts;

import projects.shoppingSite.entities.User;

public interface UserServise {
	void signIn(User user);
	void login(User user);
}
