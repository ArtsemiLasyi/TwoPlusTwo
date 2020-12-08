package by.aaproduction.tpt.dao.implementation;

import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.service.implementation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.exception.DAOException;

public class SQLUserDAO implements UserDAO {
	
	private String defaultUserRole = "USER";
	
	private String sqlTableName = "users";
	private String sqlColumnEmail = "email";
	private String sqlColumnLogin = "login";
	private String sqlColumnPasswordhash = "password_hash";
	private String sqlColumnSalt = "salt";
	private String sqlColumnUsername = "username";
	private String sqlColumnSurname = "surname";
	private String sqlColumnUserrole = "userrole";
	
	private String sqlAddNewUser = "INSERT INTO users (login , password_hash , salt , username , surname , email , userrole) Values (?, ?, ?, ?, ?, ?, 'USER') WHERE NOT EXISTS";
	
	private String sqlGetExistingUser = "SELECT * FROM users WHERE users.login = ?";
	
	@Override
	public User signIn(String login) throws DAOException {
		try {
			Configuration conf = new Configuration();
	        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(conf.getUrl(), conf.getUsername(), conf.getPassword())) {
            	String sql = "";
            	try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            		preparedStatement.setString(1, login);
            		ResultSet result = preparedStatement.executeQuery();
                    if(!result.next()) {
                        return null;
                    }
                    User user = new User();
                    user.setEmail(result.getString(sqlColumnEmail));
                    user.setLogin(result.getString(sqlColumnLogin));
                    user.setName(result.getString(sqlColumnUsername));
                    user.setSurname(result.getString(sqlColumnSurname));
                    user.setSalt(result.getString(sqlColumnSalt));
                    user.setRole(result.getString(sqlColumnUserrole));
                    user.setPasswordHash(result.getString(sqlColumnPasswordhash));
                    return user;
            	}
            	catch (Exception ex) {
            		throw new DAOException(ex);
            	}
            }
        }
        catch(Exception ex) {
        	throw new DAOException(ex);
        }
	}
	
	@Override
	public void registration(User user, String password, String salt) throws DAOException {
		try {
        	Configuration conf = new Configuration();
	        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(conf.getUrl(), conf.getUsername(), conf.getPassword())) {
            	try(PreparedStatement preparedStatement = conn.prepareStatement(sqlAddNewUser)) {
                    preparedStatement.setString(1, user.getLogin());
                    preparedStatement.setString(2, password);
                    preparedStatement.setString(3, salt);
                    preparedStatement.setString(4, user.getName());
                    preparedStatement.setString(5, user.getSurname());
                    if (preparedStatement.executeUpdate() == 0)
                    	throw new DAOException("A user with this login already exists!");
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
