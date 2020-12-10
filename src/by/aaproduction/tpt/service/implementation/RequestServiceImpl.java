/**
 * 
 */
package by.aaproduction.tpt.service.implementation;

import by.aaproduction.tpt.dao.bean.Request;
import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.dao.implementation.FactoryDAO;
import by.aaproduction.tpt.dao.interfaces.RequestDAO;
import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.service.exception.ServiceException;
import by.aaproduction.tpt.service.interfaces.RequestService;
import by.aaproduction.tpt.utils.DateComparer;

/**
 * @author Artsemy
 *
 */
public class RequestServiceImpl implements RequestService {

	@Override
	public void addRequest(Request request) throws ServiceException {
		
		try {
			boolean isRoomNumberPositive = request.getRoomNumber() > 0;
			boolean isSumPositive = request.getSum() > 0;
			boolean isDatePositive = DateComparer.CompareDates(request.getCheckOutDate(), request.getCheckInDate()) > 0;
			
			if (isRoomNumberPositive && isSumPositive && isDatePositive) {
				FactoryDAO daoObjectFactory= FactoryDAO.getInstance();
				RequestDAO requestDAO = daoObjectFactory.getRequestDAO();
				requestDAO.addRequest(request);
			}
			else
				throw new ServiceException("Data is not correct!");
		}
		catch(DAOException ex){
			throw new ServiceException(ex);
		}
	}

}
