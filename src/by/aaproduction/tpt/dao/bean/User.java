package by.aaproduction.tpt.dao.bean;

public class User {
	
	private String[] Roles = {"GUEST", "AUTHORIZEDUSER", "MANAGER", "DIRECTOR", "VIP"};
	
	private String[] Sexes = {"MALE", "FEMALE"};
	
	private String name;

	private String surname;
	
	private String email;
	
	private String city;
	
	private String country;
	
	private int age;
	
	private long id;
	
	private String about;
	
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
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public String getAbout() {
		return this.about;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
