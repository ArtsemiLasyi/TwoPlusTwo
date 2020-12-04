/**
 * 
 */
package by.aaproduction.tpt.service.interfaces;

import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.service.exception.ServiceException;

/**
 * @author Artsemy
 *
 */
public interface UserService {
	
	void signIn(String login, String password) throws ServiceException;
	
	void signOut(String login) throws ServiceException;
	
	void registration(User user) throws ServiceException;
}
