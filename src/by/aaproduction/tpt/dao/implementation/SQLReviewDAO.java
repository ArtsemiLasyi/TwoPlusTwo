/**
 * 
 */
package by.aaproduction.tpt.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.aaproduction.tpt.dao.bean.Review;
import by.aaproduction.tpt.dao.bean.ReviewList;
import by.aaproduction.tpt.dao.bean.Room;
import by.aaproduction.tpt.dao.bean.RoomList;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.dao.implementation.connection.ConnectionPool;
import by.aaproduction.tpt.dao.implementation.connection.exception.ConnectionPoolException;
import by.aaproduction.tpt.dao.interfaces.ReviewDAO;

/**
 * @author Artsemy
 *
 */
public class SQLReviewDAO implements ReviewDAO {

	private static final String sqlReviewsTableName = "reviews";
	private static final String sqlReviewsColumnId = "id";
	private static final String sqlReviewsColumnUserId = "userid";
	private static final String sqlReviewsColumnReviewText = "reviewtext";
	private static final String sqlReviewsColumnDate = "date";
	
	private static final ConnectionPool connectionPool = ConnectionPool.getInstance();
	
	private static final String sqlSeeAllReviews = "SELECT * FROM reviews";
	
	private static final String sqlInsertIntoReviews = "INSERT reviews(`userid`, `reviewtext`, `date`) VALUES (?, ?, ?)";
	
	@Override
	public ReviewList seeReviews() throws DAOException {
		Connection connection = null;
        try {
            connection = connectionPool.takeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSeeAllReviews);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet == null)
                return null;
            ReviewList reviews = new ReviewList();
            while(resultSet.next()) {
            	Review review = new Review();
            	review.setId(resultSet.getInt(sqlReviewsColumnId));
            	review.setUserId(resultSet.getInt(sqlReviewsColumnUserId));
            	review.setReviewText(resultSet.getString(sqlReviewsColumnReviewText));
            	review.setDate(resultSet.getString(sqlReviewsColumnDate));
                reviews.instance.add(review);
            }
            connectionPool.returnConnection(connection);
            return reviews;   
        }
        catch (ConnectionPoolException e) {
            throw new DAOException("Error in connection pool while getting review", e);
        }
        catch (SQLException e) {
            throw new DAOException("Error while getting review", e);
        }
        finally {
        }
	}

	@Override
	public void addReview(Review review) throws DAOException {
		Connection connection = null;
        try {
            connection = connectionPool.takeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertIntoReviews);
            preparedStatement.setInt(1, review.getUserId());
            preparedStatement.setString(2, review.getReviewText());
            preparedStatement.setString(3, review.getDate());
            preparedStatement.executeUpdate();
        }
        catch (ConnectionPoolException e) {
            throw new DAOException("Error in connection pool while inserting room", e);
        }
        catch (SQLException e) {
            throw new DAOException("Error while inserting room", e);
        }
        finally {
            connectionPool.returnConnection(connection);
        }
	}

}
