/**
 * 
 */
package by.aaproduction.tpt.service.implementation;

import by.aaproduction.tpt.service.implementation.RoomServiceImpl;
import by.aaproduction.tpt.service.implementation.UserServiceImpl;
import by.aaproduction.tpt.service.interfaces.RoomService;
import by.aaproduction.tpt.service.interfaces.UserService;

/**
 * @author Artsemy
 *
 */
public final class FactoryService {
	
	private static final FactoryService instance = new FactoryService();
	
	private final UserService userService = new UserServiceImpl();
	
	private final RoomService roomService = new RoomServiceImpl();
	
	private FactoryService() {
		
	}
	
	public static FactoryService getInstance() {
		return instance;
	}
	
	public UserService getUserService() {
		return userService;
	}
	
	public RoomService getRoomService() {
		return roomService;
	}
}
