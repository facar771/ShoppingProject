package projects.shoppingSite.business.concretes;

import java.util.List;

import projects.shoppingSite.business.abstracts.BasketService;
import projects.shoppingSite.dataAccess.abstracts.BasketRepository;
import projects.shoppingSite.entities.Product;

public class BasketManager implements BasketService{

	BasketRepository basketRepository;
	
	public BasketManager(BasketRepository basketRepository) {
		this.basketRepository = basketRepository;
	}
	
	@Override
	public List<Product> getAll(Product product) {
		return basketRepository.findAll();
	}
}
