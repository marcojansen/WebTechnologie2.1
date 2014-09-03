package model;

import java.util.ArrayList;

public class Model {
	private ArrayList<Account> accounts;
	private static Model model;
	
	private Model() {
		accounts = new ArrayList<Account>();
	}
	
	public static Model getInstance() {
		if ( model == null) {
			model = new Model();
		}
		return model;
	}
	
	public boolean addAccount(String name, String password, String type) {
		for (Account account : accounts) {
			if (account.getName().equals(name)) {
				return false;
			}
		}
		accounts.add(new Account(name,password,type));
		return true;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

}
