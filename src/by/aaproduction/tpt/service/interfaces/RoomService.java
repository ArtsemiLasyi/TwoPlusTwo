/**
 * 
 */
package by.aaproduction.tpt.service.interfaces;

import by.aaproduction.tpt.dao.bean.Room;
import by.aaproduction.tpt.service.exception.ServiceException;

/**
 * @author Artsemy
 *
 */
public interface RoomService {
	
	void addNewRoom(Room room) throws ServiceException;
	
	void addEditedRoom(Room room) throws ServiceException;
}
