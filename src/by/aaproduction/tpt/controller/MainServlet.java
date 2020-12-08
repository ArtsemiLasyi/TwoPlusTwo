package by.aaproduction.tpt.controller;

import by.aaproduction.tpt.controller.command.implementation.ChangeLanguage;
import by.aaproduction.tpt.controller.command.interfaces.Command;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import org.apache.log4j.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Controller controller;
	
    public MainServlet() {
        super();
        controller = Controller.getInstance();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strPage = request.getServletPath();
		request.getRequestDispatcher(controller.getPage(strPage)).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strCommand = request.getServletPath();
		Command command = controller.getCommand(strCommand);
		if (command != null)
			command.execute(request, response);
		doGet(request, response);
	}

}
