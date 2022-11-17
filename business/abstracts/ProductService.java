package projects.shoppingSite.business.abstracts;

import java.util.List;

import projects.shoppingSite.entities.Product;

public interface ProductService {
	List<Product> getAll();
	void add(Product product);
	void delete(Product product);
	void update(Product product);
}
