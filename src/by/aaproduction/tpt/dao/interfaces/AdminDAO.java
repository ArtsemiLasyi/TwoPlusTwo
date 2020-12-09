/**
 * 
 */
package by.aaproduction.tpt.dao.interfaces;

import by.aaproduction.tpt.dao.bean.RequestList;
import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.exception.DAOException;

/**
 * @author Artsemy
 *
 */
public interface AdminDAO {

	RequestList seeRequests() throws DAOException;
	
	void adminRegistration(User user, String password, String salt) throws DAOException;
}
