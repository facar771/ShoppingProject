package projects.shoppingSite.entities;

import lombok.Data;

@Data
public class User {
	private int id;
	private String userName;
	private String eMail;
	private String password;
}
