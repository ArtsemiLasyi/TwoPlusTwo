/**
 * 
 */
package by.aaproduction.tpt.service.interfaces;

import by.aaproduction.tpt.dao.bean.Room;
import by.aaproduction.tpt.dao.bean.RoomList;
import by.aaproduction.tpt.dao.exception.DAOException;
import by.aaproduction.tpt.service.exception.ServiceException;

/**
 * @author Artsemy
 *
 */
public interface RoomService {
	
	void addRoom(Room room) throws ServiceException;
	
	void deleteRoom(Room room) throws ServiceException;

	RoomList getAllRooms() throws ServiceException;

	void editRoom(Room room) throws ServiceException;
}
