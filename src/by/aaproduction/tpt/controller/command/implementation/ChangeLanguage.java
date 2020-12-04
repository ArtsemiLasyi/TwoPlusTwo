/**
 * 
 */
package by.aaproduction.tpt.controller.command.implementation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.aaproduction.tpt.controller.command.interfaces.Command;

/**
 * @author Artsemy
 *
 */
public class ChangeLanguage implements Command {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String russian = "ru";
		String english = "en";
		String attributeName = "lang";
		HttpSession session = request.getSession(true);
		String language = request.getParameter(attributeName);
		if (language != null) {
			if (language.equals(english)) {
				session.setAttribute(attributeName, english);
			}
			else if (language.equals(russian)) {
				session.setAttribute(attributeName, russian);
			}
		}
	}

}
