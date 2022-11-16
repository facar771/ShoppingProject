package projects.shoppingSite.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.shoppingSite.business.abstracts.ProductServise;
import projects.shoppingSite.entities.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private ProductServise productServise;
	
	@Autowired
	public ProductController(ProductServise productServise) {
		this.productServise = productServise;
	}
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return productServise.getAll();
	}
}
