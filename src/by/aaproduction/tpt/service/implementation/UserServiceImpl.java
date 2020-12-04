package by.aaproduction.tpt.service.implementation;

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
	public void registration(User user) throws ServiceException {
		//...
	}

}
