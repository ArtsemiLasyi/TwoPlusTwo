package by.aaproduction.tpt.dao.bean;

public class Room {
	
	private int numberOfPeople;
	
	private int price;
	
	private long id;
	
	private boolean hasAddedPlace;
	
	private boolean mealsIncluded;
	
	private String about;
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public String getAbout() {
		return this.about;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setNumberOfPeople(int numberofpeople) {
		this.numberOfPeople = numberofpeople;
	}
	
	public int getNumberOfPeople() {
		return this.numberOfPeople;
	}
}
