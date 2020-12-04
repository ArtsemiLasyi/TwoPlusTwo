package by.aaproduction.tpt.dao.implementation;

import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.service.implementation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.exception.DAOException;

public class SQLUserDAO implements UserDAO {
	
	@Override
	public void signIn(String login, String password) throws DAOException {
		try {
        	Configuration conf = new Configuration();
            String dbUrl = conf.getUrl();
            String dbUsername = conf.getUsername();
            String dbPassword = conf.getPassword();
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword)) {
            	
            }
        }
        catch(Exception ex) {
        	throw new DAOException(ex);
        }
        finally {
        }
	}
	
	@Override
	public void registration(User user) throws DAOException {
		
	}
}
