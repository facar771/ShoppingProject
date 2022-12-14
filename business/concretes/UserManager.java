package projects.shoppingSite.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projects.shoppingSite.business.abstracts.UserService;
import projects.shoppingSite.dataAccess.abstracts.UserRepository;
import projects.shoppingSite.entities.User;

@Service
public class UserManager implements UserService{

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
