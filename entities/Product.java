package projects.shoppingSite.entities;

import java.util.List;

import lombok.Data;

@Data
public class Product {
	private int id;
	private int unitPrice;
	private String size;
	private String name;
	private List<Discount> discounts;
}
