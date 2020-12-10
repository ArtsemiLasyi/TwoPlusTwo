/**
 * 
 */
package by.aaproduction.tpt.service.implementation;

import by.aaproduction.tpt.dao.bean.Review;
import by.aaproduction.tpt.dao.bean.ReviewList;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.dao.implementation.FactoryDAO;
import by.aaproduction.tpt.dao.interfaces.ReviewDAO;
import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.service.exception.ServiceException;
import by.aaproduction.tpt.service.interfaces.ReviewService;

/**
 * @author Artsemy
 *
 */
public class ReviewServiceImpl implements ReviewService {

	@Override
	public ReviewList seeReviews() throws ServiceException {
		try {
			ReviewList reviewList = null;
			FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
			ReviewDAO reviewDAO = daoObjectFactory.getReviewDAO();
			reviewList = reviewDAO.seeReviews();
			return reviewList;
		}
		catch(DAOException ex) {
			throw new ServiceException(ex);
		}
	}

	@Override
	public void addReview(Review review) throws ServiceException {
		boolean textIsEmpty = (review.getReviewText().length() == 0);
		boolean userIdNotValid = (review.getUserId() <= 0);
		if (textIsEmpty || userIdNotValid) {
			throw new ServiceException("Data is not valid!");
		}
		try {
			FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
			ReviewDAO reviewDAO = daoObjectFactory.getReviewDAO();
			reviewDAO.addReview(review);
		}
		catch(DAOException ex) {
			throw new ServiceException(ex);
		}
	}
}
