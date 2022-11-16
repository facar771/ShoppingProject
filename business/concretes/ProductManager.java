package projects.shoppingSite.business.concretes;

import java.util.List;

import projects.shoppingSite.business.abstracts.ProductServise;
import projects.shoppingSite.dataAccess.abstracts.ProductRepository;
import projects.shoppingSite.entities.Product;

public class ProductManager implements ProductServise{

	private ProductRepository productRepository;
	
	public ProductManager(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}
}
