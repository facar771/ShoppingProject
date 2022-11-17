package projects.shoppingSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import projects.shoppingSite.entities.Basket;

public interface BasketRepository extends JpaRepository<Basket, Integer>{
	
}
