/**
 * 
 */
package by.aaproduction.tpt.service.implementation;

import by.aaproduction.tpt.service.implementation.RoomServiceImpl;
import by.aaproduction.tpt.service.implementation.UserServiceImpl;
import by.aaproduction.tpt.service.interfaces.AdminService;
import by.aaproduction.tpt.service.interfaces.RequestService;
import by.aaproduction.tpt.service.interfaces.ReviewService;
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
	
	private final RequestService requestService = new RequestServiceImpl();
	
	private final ReviewService reviewService = new ReviewServiceImpl();
	
	private final AdminService adminService = new AdminServiceImpl();
	
	
	private FactoryService() {
		
	}
	
	public static FactoryService getInstance() {
		return instance;
	}
	
	public ReviewService getReviewService() {
		return reviewService;
	}
	
	public AdminService getAdminService() {
		return adminService;
	}
	
	public RequestService getRequestService() {
		return requestService;
	}
	
	public UserService getUserService() {
		return userService;
	}
	
	public RoomService getRoomService() {
		return roomService;
	}
}
