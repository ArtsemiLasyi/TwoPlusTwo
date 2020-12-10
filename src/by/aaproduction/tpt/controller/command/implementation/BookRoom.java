/**
 * 
 */
package by.aaproduction.tpt.controller.command.implementation;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.aaproduction.tpt.controller.command.interfaces.Command;
import by.aaproduction.tpt.dao.bean.Request;
import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.service.exception.ServiceException;
import by.aaproduction.tpt.service.implementation.FactoryService;
import by.aaproduction.tpt.service.interfaces.RequestService;
import by.aaproduction.tpt.service.interfaces.UserService;
import by.aaproduction.tpt.utils.TypeConverter;

/**
 * @author Artsemy
 *
 */
public class BookRoom implements Command {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String error = null;
		HttpSession session;
		Request req;
		
		session = request.getSession();
		User user = (User)session.getAttribute("User");
		try {
			Date checkInDate = TypeConverter.convertFromStringToDate(request.getParameter("checkInDate"));
			Date checkOutDate = TypeConverter.convertFromStringToDate(request.getParameter("checkOutDate"));
			int roomNumber = Integer.parseInt(request.getParameter("roomnumber"));
			double sum = Double.parseDouble(request.getParameter("sum"));
			req = new Request();
			req.setUserLogin(user.getLogin());
			req.setCheckInDate(checkInDate);
			req.setCheckOutDate(checkOutDate);
			req.setRoomNumber(roomNumber);
			
			FactoryService factory = FactoryService.getInstance();
			RequestService requestService = factory.getRequestService();
			try {
				requestService.addRequest(req);
			} catch (ServiceException ex) {
				ex.printStackTrace();
			}
		} catch (ParseException e) {
			error = "Incorrect data!";
		} 
		
	}

}
