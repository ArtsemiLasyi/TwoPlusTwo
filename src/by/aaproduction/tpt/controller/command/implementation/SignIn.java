/**
 * 
 */
package by.aaproduction.tpt.controller.command.implementation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.aaproduction.tpt.controller.command.interfaces.Command;
import by.aaproduction.tpt.service.implementation.UserServiceImpl;
import by.aaproduction.tpt.dao.bean.User;
import by.aaproduction.tpt.service.interfaces.UserService;
import by.aaproduction.tpt.service.implementation.FactoryService;
import by.aaproduction.tpt.service.exception.ServiceException;

/**
 * @author Artsemy
 *
 */
public class SignIn implements Command {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		FactoryService factory = FactoryService.getInstance();
		UserService userService = factory.getUserService();
		try {
			User user = userService.signIn(login, password);
		} catch(ServiceException ex) {
			
		}
	}
}
