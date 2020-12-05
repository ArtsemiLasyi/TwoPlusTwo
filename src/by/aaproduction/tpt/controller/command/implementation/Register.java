/**
 * 
 */
package by.aaproduction.tpt.controller.command.implementation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import by.aaproduction.tpt.controller.command.interfaces.Command;
import by.aaproduction.tpt.service.implementation.UserServiceImpl;
import by.aaproduction.tpt.service.interfaces.UserService;
import by.aaproduction.tpt.service.implementation.FactoryService;
import by.aaproduction.tpt.service.exception.ServiceException;
import by.aaproduction.tpt.dao.bean.User;

/**
 * @author Artsemy
 *
 */
public class Register implements Command {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String name = request.getParameter("username");
		String surname = request.getParameter("usersurname");
		String email = request.getParameter("email");
		User user = new User();
		user.setName(name);
		user.setSurname(surname);
		user.setEmail(email);
		user.setLogin(login);
		
		FactoryService factory = FactoryService.getInstance();
		UserService userService = factory.getUserService();
		try {
			userService.registration(user, password);
		} catch (ServiceException ex) {
			ex.printStackTrace();
		}
	}
	
}
