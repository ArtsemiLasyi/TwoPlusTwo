package by.aaproduction.tpt.dao.interfaces;

import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.exception.DAOException;

public interface UserDAO {
	
	User signIn(String login) throws DAOException;
	
	void registration(User user, String password, String salt) throws DAOException;
}
