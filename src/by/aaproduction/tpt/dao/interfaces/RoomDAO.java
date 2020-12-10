package by.aaproduction.tpt.dao.interfaces;

import by.aaproduction.tpt.dao.bean.Room;
import by.aaproduction.tpt.dao.bean.RoomList;
import by.aaproduction.tpt.dao.exception.DAOException;

public interface RoomDAO {
	
	void addRoom(Room room) throws DAOException;
	
	void deleteRoom(Room room) throws DAOException;

	RoomList getAllRooms() throws DAOException;

	void editRoom(Room room) throws DAOException;
}
