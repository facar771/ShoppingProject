package projects.shoppingSite.entities;

import java.util.List;

import lombok.Data;

@Data
public class Basket {
	private int id;
	private int totalPrice;
	private User user;
	private List<Product> products;
}
