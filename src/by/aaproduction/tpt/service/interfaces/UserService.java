/**
 * 
 */
package by.aaproduction.tpt.service.interfaces;

import by.aaproduction.tpt.dao.bean.User;

/**
 * @author Artsemy
 *
 */
public interface UserService {
	void singIn(String login, String password);
	
	void singOut(String login);
	
	void registration(User user);
}
