/**
 * 
 */
package by.aaproduction.tpt.controller.command.implementation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import by.aaproduction.tpt.controller.command.interfaces.Command;
import by.aaproduction.tpt.service.implementation.UserServiceImpl;
import by.aaproduction.tpt.service.interfaces.UserService;
import by.aaproduction.tpt.service.implementation.FactoryService;
import by.aaproduction.tpt.service.exception.ServiceException;

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
		if (login != null && password != null) {
			String salt = getSalt();
			String securePassword = getSecurePassword(password, salt);
		}
	}
	
	
	public static String getSecurePassword(String password, String salt) {

        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt.getBytes());
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }
	
	private String getSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return new String(salt);
    }
	
}
