package by.aaproduction.tpt.service.implementation;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.dao.implementation.FactoryDAO;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.service.interfaces.UserService;
import by.aaproduction.tpt.utils.Hasher;
import by.aaproduction.tpt.service.exception.ServiceException;

public class UserServiceImpl implements UserService {
	
	@Override
	public User signIn(String login, String password) throws ServiceException {
		
		if (login == null || login.isEmpty()) { 
			throw new ServiceException("Incorrect login");
		}		
		try {
			FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
			UserDAO userDAO = daoObjectFactory.getUserDAO();
			User user = userDAO.signIn(login);
			if (Hasher.isEqualPasswordHash(password, user))
				return user;
			else
				return null;
		}
		catch(DAOException ex){
			throw new ServiceException(ex);
		}
		
	}
	
	@Override
	public void registration(User user, String password) throws ServiceException {
		if (user.getLogin() != null && password != null) {
			String salt = Hasher.getSalt();
			String securePassword = Hasher.getSecurePassword(password, salt);
			try {
				FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
				UserDAO userDAO = daoObjectFactory.getUserDAO();
				userDAO.registration(user, securePassword, salt);
			}
			catch(DAOException ex) {
				throw new ServiceException(ex);
			}
		}
	}

}
