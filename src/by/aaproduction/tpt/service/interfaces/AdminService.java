/**
 * 
 */
package by.aaproduction.tpt.service.interfaces;

import by.aaproduction.tpt.dao.bean.RequestList;
import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.service.exception.ServiceException;

/**
 * @author Artsemy
 *
 */
public interface AdminService {

	RequestList seeRequests() throws ServiceException;
	
	void adminRegistration(User user, String password) throws ServiceException;
}
