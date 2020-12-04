/**
 * 
 */
package by.aaproduction.tpt.service.interfaces;

import by.aaproduction.tpt.dao.bean.Room;

/**
 * @author Artsemy
 *
 */
public interface RoomService {
	
	void addNewRoom(Room room);
	
	void addEditedRoom(Room room);
}
