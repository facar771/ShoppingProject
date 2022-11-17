package projects.shoppingSite.entities;

import java.util.List;

import lombok.Data;

@Data
public class Basket {
	private int id;
	private int totalPrice;
	private List<Product> products;
}