package by.aaproduction.tpt.dao.bean;

public class User {
	
	private String[] Roles = {"GUEST", "AUTHORIZEDUSER", "MANAGER", "DIRECTOR", "VIP"};
	
	private String[] Sexes = {"MALE", "FEMALE"};
	
	private String name;
	
	private String login;

	private String surname;
	
	private String email;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
}
