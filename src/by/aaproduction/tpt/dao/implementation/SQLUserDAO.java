package by.aaproduction.tpt.dao.implementation;

import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.service.implementation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.exception.DAOException;

public class SQLUserDAO implements UserDAO {
	
	@Override
	public void signIn(String login, String password) throws DAOException {
		try {
			Configuration conf = new Configuration();
	        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(conf.getUrl(), conf.getUsername(), conf.getPassword())) {
            	String sql = "";
            	try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            		
            	}
            	catch (Exception ex) {
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
	public void registration(User user,String password, String salt) throws DAOException {
		try {
        	Configuration conf = new Configuration();
	        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(conf.getUrl(), conf.getUsername(), conf.getPassword())) {
            	String sql = "INSERT INTO users (login , password_hash , salt , username , surname , userrole) Values (?, ?, ?, ?, ?, 'USER')";
            	try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, user.getLogin());
                    preparedStatement.setString(2, password);
                    preparedStatement.setString(3, salt);
                    preparedStatement.setString(4, user.getName());
                    preparedStatement.setString(5, user.getSurname());
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
