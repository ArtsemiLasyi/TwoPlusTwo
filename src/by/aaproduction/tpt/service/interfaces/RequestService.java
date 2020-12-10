/**
 * 
 */
package by.aaproduction.tpt.service.interfaces;

import by.aaproduction.tpt.dao.bean.Request;
import by.aaproduction.tpt.service.exception.ServiceException;

/**
 * @author Artsemy
 *
 */
public interface RequestService {
	
	void addRequest(Request request) throws ServiceException;

}
