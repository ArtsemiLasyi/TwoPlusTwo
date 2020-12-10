/**
 * 
 */
package by.aaproduction.tpt.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import by.aaproduction.tpt.dao.bean.Request;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.dao.implementation.connection.ConnectionPool;
import by.aaproduction.tpt.dao.interfaces.RequestDAO;
import by.aaproduction.tpt.utils.TypeConverter;

/**
 * @author Artsemy
 *
 */
public class SQLRequestDAO implements RequestDAO {

	
	private String sqlAddNewRequest = "INSERT INTO requests (login , roomnumber , sum , checkindate , checkoutdate) Values (?, ?, ?, ?, ?)";
	
	private static final ConnectionPool connectionPool = ConnectionPool.getInstance();
	
	@Override
	public void addRequest(Request request) throws DAOException {
		
		try {
            try (Connection connection = connectionPool.takeConnection()) {
            	try(PreparedStatement preparedStatement = connection.prepareStatement(sqlAddNewRequest)) {
                    preparedStatement.setString(1, request.getUserLogin());
                    preparedStatement.setString(2, Integer.toString(request.getRoomNumber()));
                    preparedStatement.setString(3, Double.toString(request.getSum()));
                    preparedStatement.setString(4, TypeConverter.convertFromDateToString(request.getCheckInDate()));
                    preparedStatement.setString(5, TypeConverter.convertFromDateToString(request.getCheckOutDate()));
                    preparedStatement.executeUpdate();
                }
            	catch(Exception ex) {
                	throw new DAOException(ex);
                }
            }
        }
        catch(Exception ex) {
        	throw new DAOException(ex);
        }
        finally {
        }
		
	}

}
