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
	
	private User user;
	
	private String reviewText;
	
	private String date;
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user; 
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
