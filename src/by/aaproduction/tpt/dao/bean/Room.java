package by.aaproduction.tpt.dao.bean;

public class Room {
	
	private int numberOfPeople;
	
	private double price;
	
	private long id;
	
	private int number;
	
	private boolean hasAddedPlace;
	
	private boolean mealsIncluded;
	
	private boolean isBusy;
	
	private String about;
	
	public void setIsBusy(boolean flag) {
		this.isBusy = flag;
	}
	
	public boolean getIsBusy() {
		return this.isBusy;
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
