package projects.shoppingSite.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projects.shoppingSite.business.abstracts.ProductServise;
import projects.shoppingSite.dataAccess.abstracts.ProductRepository;
import projects.shoppingSite.entities.Product;

@Service
public class ProductManager implements ProductServise{

	private ProductRepository productRepository;
	
	@Autowired
	public ProductManager(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public void add(Product product) {
		productRepository.save(product);
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);
	}

	@Override
	public void update(Product product) {
		productRepository.save(product);
	}
}
