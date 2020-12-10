package by.aaproduction.tpt.dao.implementation;

import by.aaproduction.tpt.dao.interfaces.UserDAO;
import by.aaproduction.tpt.dao.interfaces.AdminDAO;
import by.aaproduction.tpt.dao.interfaces.RequestDAO;
import by.aaproduction.tpt.dao.interfaces.ReviewDAO;
import by.aaproduction.tpt.dao.interfaces.RoomDAO;

public final class FactoryDAO {
	
	private static final FactoryDAO instance = new FactoryDAO();
	
	private final RoomDAO sqlRoomImplementation = new SQLRoomDAO();
	
	private final UserDAO sqlUserImplementation = new SQLUserDAO();
	
	private final ReviewDAO sqlReviewImplementation = new SQLReviewDAO();
	
	private final RequestDAO sqlRequestImplementation = new SQLRequestDAO();
	
	private final AdminDAO sqlAdminImplementation = new SQLAdminDAO();
	
	private FactoryDAO() {
		
	}
	
	public static FactoryDAO getInstance() {
		return instance;
	}
	
	public ReviewDAO getReviewDAO() {
		return sqlReviewImplementation;
	}
	
	public RequestDAO getRequestDAO() {
		return sqlRequestImplementation;
	}
	
	public AdminDAO getAdminDAO() {
		return sqlAdminImplementation;
	}
	
	public RoomDAO getRoomDAO() {
		return sqlRoomImplementation;
	}
	
	public UserDAO getUserDAO() {
		return sqlUserImplementation;
	}
}
