/**
 * 
 */
package by.aaproduction.tpt.service.interfaces;

import by.aaproduction.tpt.dao.bean.Review;
import by.aaproduction.tpt.dao.bean.ReviewList;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.service.exception.ServiceException;

/**
 * @author Artsemy
 *
 */
public interface ReviewService {

	ReviewList seeReviews() throws ServiceException;
	
	void addReview(Review review) throws ServiceException;
}
