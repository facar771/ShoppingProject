package projects.shoppingSite.entities;

import lombok.Data;

@Data
public class Discount {
	private int id;
	private String name;
	private Product product;
}
