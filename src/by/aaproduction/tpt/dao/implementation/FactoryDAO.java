package by.aaproduction.tpt.dao.implementation;

import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.dao.interfaces.RoomDAO;

public final class FactoryDAO {
	
	private static final FactoryDAO instance = new FactoryDAO();
	
	private final RoomDAO sqlRoomImplementation = new SQLRoomDAO();
	
	private final UserDAO sqlUserImplementation = new SQLUserDAO();
	
	private FactoryDAO() {
		
	}
	
	public static FactoryDAO getInstance() {
		return instance;
	}
	
	public RoomDAO getRoomDAO() {
		return sqlRoomImplementation;
	}
	
	public UserDAO getUserDAO() {
		return sqlUserImplementation;
	}
}
