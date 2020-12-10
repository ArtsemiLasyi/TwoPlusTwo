/**
 * 
 */
package by.aaproduction.tpt.dao.interfaces;

import by.aaproduction.tpt.dao.bean.Review;
import by.aaproduction.tpt.dao.bean.ReviewList;
import by.aaproduction.tpt.dao.exception.DAOException;

/**
 * @author Artsemy
 *
 */
public interface ReviewDAO {
	
	ReviewList seeReviews() throws DAOException;
	
	void addReview(Review review) throws DAOException;
}
