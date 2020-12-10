package by.aaproduction.tpt.dao.bean;

public class Room {
	
	private int numberOfPeople;
	
	private double price;
	
	private int id;
	
	private int number;
	
	private boolean hasAddedPlace;
	
	private boolean mealsIncluded;
	
	private boolean isBusy;
	
	private String about;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setHasAddedPlace(boolean hasaddedprice) {
		this.hasAddedPlace = hasaddedprice;
	}
	
	public boolean getHasAddedPlace() {
		return this.hasAddedPlace;
	}
	
	public void setIsBusy(boolean isbusy) {
		this.isBusy = isbusy;
	}
	
	public boolean getIsBusy() {
		return this.isBusy;
	}
	
	public void setMealsIncluded(boolean mealsincluded) {
		this.mealsIncluded = mealsincluded;
	}
	
	public boolean getMealsIncluded() {
		return this.mealsIncluded;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public String getAbout() {
		return this.about;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setNumberOfRoom(int numberofroom) {
		this.number = numberofroom;
	}
	
	public int getNumberOfRoom() {
		return this.number;
	}
	
	public void setNumberOfPeople(int numberofpeople) {
		this.numberOfPeople = numberofpeople;
	}
	
	public int getNumberOfPeople() {
		return this.numberOfPeople;
	}
}
