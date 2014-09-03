package model;

public class Account {
	private String name;
	private String password;
	private String type;
	
	public Account(String name, String password, String type) {
		this.name = name;
		this.password = password;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

}
