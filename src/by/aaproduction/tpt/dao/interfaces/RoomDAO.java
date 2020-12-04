package by.aaproduction.tpt.dao.interfaces;

import by.aaproduction.tpt.dao.bean.Room;

public interface RoomDAO {
	
	void addRoom(Room room);
	
	void deleteRoom(long idRoom);
	
	void delete(Room room);
}
