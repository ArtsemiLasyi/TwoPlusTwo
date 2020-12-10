/**
 * 
 */
package by.aaproduction.tpt.service.implementation;

import by.aaproduction.tpt.dao.bean.RequestList;
import by.aaproduction.tpt.dao.bean.ReviewList;
import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.dao.implementation.FactoryDAO;
import by.aaproduction.tpt.dao.interfaces.AdminDAO;
import by.aaproduction.tpt.dao.interfaces.RequestDAO;
import by.aaproduction.tpt.dao.interfaces.ReviewDAO;
import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.service.exception.ServiceException;
import by.aaproduction.tpt.service.interfaces.AdminService;
import by.aaproduction.tpt.utils.Hasher;

/**
 * @author Artsemy
 *
 */
public class AdminServiceImpl implements AdminService {

	@Override
	public RequestList seeRequests() throws ServiceException {
		try {
			RequestList requestList = null;
			FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
			AdminDAO AdminDAO = daoObjectFactory.getAdminDAO();
			requestList = AdminDAO.seeRequests();
			return requestList;
		}
		catch(DAOException ex) {
			throw new ServiceException(ex);
		}
	}

	@Override
	public void adminRegistration(User user, String password) throws ServiceException {
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
