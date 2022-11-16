package projects.shoppingSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import projects.shoppingSite.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
