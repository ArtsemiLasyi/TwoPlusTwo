package by.aaproduction.tpt.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import by.aaproduction.tpt.dao.bean.Request;
import by.aaproduction.tpt.dao.bean.RequestList;
import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.dao.implementation.connection.ConnectionPool;
import by.aaproduction.tpt.dao.interfaces.AdminDAO;

public class SQLAdminDAO implements AdminDAO {
	
	private String defaultAdminRole = "ADMIN";
	
	private String sqlUsersTableName = "users";
	private String sqlUsersColumnEmail = "email";
	private String sqlUsersColumnLogin = "login";
	private String sqlUsersColumnPasswordhash = "password_hash";
	private String sqlUsersColumnSalt = "salt";
	private String sqlUsersColumnUsername = "username";
	private String sqlUsersColumnSurname = "surname";
	private String sqlUsersColumnUserrole = "userrole";
	
	private String sqlRequestsTableName = "requests";
	private String sqlRequestsColumnSum = "sum";
	private String sqlRequestsColumnCheckInDate = "checkindate";
	private String sqlRequestsColumnCheckOutDate = "checkoutdate";
	private String sqlRequestsColumnRoomNumber = "roomnumber";
	private String sqlRequestsColumnUserLogin = "userlogin";
	
	
	
	private String sqlAddNewAdmin = "INSERT INTO users (login , password_hash , salt , username , surname , email , userrole) Values (?, ?, ?, ?, ?, ?, 'ADMIN')";
	
	private String sqlSeeAllRequests = "SELECT * FROM requests";
	
	private static final ConnectionPool connectionPool = ConnectionPool.getInstance();
	
	@Override
	public void adminRegistration(User user, String password, String salt) throws DAOException {
		try {
            try (Connection connection = connectionPool.takeConnection()) {
            	try(PreparedStatement preparedStatement = connection.prepareStatement(sqlAddNewAdmin)) {
                    preparedStatement.setString(1, user.getLogin());
                    preparedStatement.setString(2, password);
                    preparedStatement.setString(3, salt);
                    preparedStatement.setString(4, user.getName());
                    preparedStatement.setString(5, user.getSurname());
                    preparedStatement.setString(6, user.getEmail());
                    if (preparedStatement.executeUpdate() == 0)
                    	throw new DAOException("An admin with this login already exists!");
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

	@Override
	public RequestList seeRequests() throws DAOException {
		try {
            try (Connection connection = connectionPool.takeConnection()) {
            	try(PreparedStatement preparedStatement = connection.prepareStatement(sqlSeeAllRequests)) {
            		ResultSet result = preparedStatement.executeQuery();
            		RequestList requestList = new RequestList();
                    while (result.next()) {
                    	Request request = new Request();
                        request.setSum(result.getDouble(sqlRequestsColumnSum));
                        request.setCheckInDate(result.getString(sqlRequestsColumnCheckInDate);
                        requestList.instance.add(request);
                    }
                    return requestList;
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
