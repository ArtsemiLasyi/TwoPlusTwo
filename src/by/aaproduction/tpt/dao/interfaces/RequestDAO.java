/**
 * 
 */
package by.aaproduction.tpt.dao.interfaces;

import by.aaproduction.tpt.dao.bean.Request;
import by.aaproduction.tpt.dao.exception.DAOException;

/**
 * @author Artsemy
 *
 */
public interface RequestDAO {
	
	void addRequest(Request request) throws DAOException;

}
