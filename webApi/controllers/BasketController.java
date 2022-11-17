package projects.shoppingSite.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.shoppingSite.business.abstracts.BasketService;
import projects.shoppingSite.entities.Product;

@RestController
@RequestMapping("api/basket")
public class BasketController {
	
	private BasketService basketService;
	
	public BasketController(BasketService basketService) {
		this.basketService = basketService;
	}
	
	public List<Product> getAll(Product product) {
		return basketService.getAll(product);
	}
}
