package projects.shoppingSite.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.shoppingSite.business.abstracts.ProductService;
import projects.shoppingSite.entities.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	// KULLANICINIIN KONTROL EDEMEDİĞİ BÖLÜM
	@PostMapping("/add")
	public void add(Product product) {
		productService.add(product);
	}
	
	@PostMapping("/delete")
	public void delete(Product product) {
		productService.delete(product);
	}
	
	@PostMapping("/update")
	public void update(Product product) {
		productService.update(product);
	}
	
	// KULLANICINIIN İSTEKTE BULUNDUĞU KISIM
	@GetMapping("/getall")
	public List<Product> getAll(){
		return productService.getAll();
	}
}
