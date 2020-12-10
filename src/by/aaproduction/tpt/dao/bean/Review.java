/**
 * 
 */
package by.aaproduction.tpt.dao.bean;

import by.aaproduction.tpt.dao.bean.User;

/**
 * @author Artsemy
 *
 */
public class Review {
	
	private int id;
	
	private int userId;
	
	private String reviewText;
	
	private String date;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setUserId(int userid) {
		this.userId = userid; 
	}
	
	public String getReviewText() {
		return this.reviewText;
	}
	
	public void setReviewText(String reviewtext) {
		this.reviewText = reviewtext;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
}
