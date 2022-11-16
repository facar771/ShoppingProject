package projects.shoppingSite.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import projects.shoppingSite.business.abstracts.UserServise;
import projects.shoppingSite.dataAccess.abstracts.UserRepository;
import projects.shoppingSite.entities.User;

public class UserManager implements UserServise{

    private	UserRepository userRepository;
    
    @Autowired
    public UserManager(UserRepository userRepository) {
    	this.userRepository = userRepository;
    }
	
	@Override
	public void signIn(User user) {
		userRepository.save(user);
	}

	@Override
	public void login(User user) {
		userRepository.findAll();
	}
}
