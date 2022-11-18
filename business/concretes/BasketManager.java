package projects.shoppingSite.business.concretes;

import java.util.List;

import projects.shoppingSite.business.abstracts.BasketService;
import projects.shoppingSite.dataAccess.abstracts.BasketRepository;
import projects.shoppingSite.entities.Basket;
import projects.shoppingSite.entities.Product;

public class BasketManager implements BasketService{

	BasketRepository basketRepository;
	
	public BasketManager(BasketRepository basketRepository) {
		this.basketRepository = basketRepository;
	}
	
	@Override
	public List<Product> getBasket(Basket basket) {
		Basket basket2 = new Basket();
		basket2 = basketRepository.findById(basket.getId()).get();
		
	    return basket2.getProducts();
	}
}
