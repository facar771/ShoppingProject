package projects.shoppingSite.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import projects.shoppingSite.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
