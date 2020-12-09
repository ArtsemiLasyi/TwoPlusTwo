package by.aaproduction.tpt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import by.aaproduction.tpt.controller.command.interfaces.Command;

/**
 * Servlet implementation class ReviewServlet
 */
@WebServlet("/Review")
public class ReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session;
	private Logger logger;
	
	private Controller controller;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewServlet() {
        super();
        PropertyConfigurator.configure(this.getClass().getClassLoader().getResource("log4j.properties"));
        controller = Controller.getInstance();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strPage = request.getServletPath();
		request.getRequestDispatcher(controller.getPage(strPage)).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strCommand = request.getServletPath();
		Command command = controller.getCommand(strCommand);
		if (command != null)
			command.execute(request, response);
		doGet(request, response);
	}

}
