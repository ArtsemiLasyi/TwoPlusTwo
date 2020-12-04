package by.aaproduction.tpt.dao.interfaces;

import by.aaproduction.tpt.dao.bean.Room;
import by.aaproduction.tpt.dao.exception.DAOException;

public interface RoomDAO {
	
	void addRoom(Room room) throws DAOException;
	
	void deleteRoom(long idRoom) throws DAOException;
	
	void delete(Room room) throws DAOException;
}
