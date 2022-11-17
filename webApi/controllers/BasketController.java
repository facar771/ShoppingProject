package projects.shoppingSite.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.shoppingSite.business.abstracts.BasketService;
import projects.shoppingSite.entities.Basket;
import projects.shoppingSite.entities.Product;

@RestController
@RequestMapping("api/basket")
public class BasketController {
	
	private BasketService basketService;
	
	@Autowired
	public BasketController(BasketService basketService) {
		this.basketService = basketService;
	}
	
	// KULLANICINIIN İSTEKTE BULUNDUĞU KISIM
	@GetMapping("/getbasket")
	public List<Product> getBasket(Basket basket) {
		return basketService.getBasket(basket);
	}
}
