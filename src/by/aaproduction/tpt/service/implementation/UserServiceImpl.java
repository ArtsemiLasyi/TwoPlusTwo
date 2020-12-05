package by.aaproduction.tpt.service.implementation;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.dao.implementation.FactoryDAO;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.service.interfaces.UserService;
import by.aaproduction.tpt.service.exception.ServiceException;

public class UserServiceImpl implements UserService {
	
	@Override
	public void signIn(String login, String password) throws ServiceException {
		
		if (login == null || login.isEmpty()) { 
			throw new ServiceException("Incorrect login");
		}
		
		try {
			FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
			UserDAO userDAO = daoObjectFactory.getUserDAO();
			userDAO.signIn(login, password);
		}
		catch(DAOException ex){
			throw new ServiceException(ex);
		}
		
	}
	
	@Override
	public void signOut(String login) throws ServiceException {
		//...
	}
	
	@Override
	public void registration(User user, String password) throws ServiceException {
		if (user.getLogin() != null && password != null) {
			String salt = getSalt();
			String securePassword = getSecurePassword(password, salt);
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
	
	private static String getSecurePassword(String password, String salt) {

        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt.getBytes());
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }
	
	private String getSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return new String(salt);
    }

}
