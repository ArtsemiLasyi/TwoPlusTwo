/**
 * 
 */
package by.aaproduction.tpt.dao.bean;

import java.util.Date;

/**
 * @author Artsemy
 *
 */
public class Request {

	private int userId;
	
	private String userLogin;
	
	private int roomNumber;
	
	private int roomId;
	
	private double sum;
	
	private Date checkInDate;
	
	private Date checkOutDate;
	
	
	public String getUserLogin() {
		return this.userLogin;
	}
	
	public void setUserLogin(String login) {
		this.userLogin = login;
	}
	
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public void setRoomNumber(int number) {
		this.roomNumber = number;
	}
	
	
	public double getSum() {
		return this.sum;
	}
	
	public void setSum(double sum) {
		this.sum = sum; 
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setUserId(int id) {
		this.userId = id;
	}
	
	public int getRoomId() {
		return this.roomId;
	}
	
	public void setRoomId(int id) {
		this.roomId = id;
	}
	
	public Date getCheckInDate() {
		return this.checkInDate;
	}
	
	public void setCheckInDate(Date date) {
		this.checkInDate = date;
	}
	
	public Date getCheckOutDate() {
		return this.checkOutDate;
	}
	
	public void setCheckOutDate(Date date) {
		this.checkOutDate = date;
	}
	
}
