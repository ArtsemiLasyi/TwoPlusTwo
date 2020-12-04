package by.aaproduction.tpt.service.implementation;

import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.dao.implementation.FactoryDAO;
import by.aaproduction.tpt.service.interfaces.UserService;

public class UserServiceImpl implements UserService {
	
	@Override
	public void singIn(String login, String password) {
		
		FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
		UserDAO userDAO= daoObjectFactory.getUserDAO();
		userDAO.signIn(login, password);
		//....
	}
	
	@Override
	public void singOut(String login) {
		//...
	}
	
	@Override
	public void registration(User user) {
		//...
	}

}
