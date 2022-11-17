package projects.shoppingSite.business.abstracts;

import java.util.List;

import projects.shoppingSite.entities.Basket;
import projects.shoppingSite.entities.Product;

public interface BasketService {
	List<Product> getAll(Basket basket);
}
