/**
 * 
 */
package by.aaproduction.tpt.controller.command.interfaces;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Artsemy
 *
 */
public interface Command {
	public void execute(HttpServletRequest request, HttpServletResponse response);
}
