package by.aaproduction.tpt.controller;

import by.aaproduction.tpt.controller.command.implementation.ChangeLanguage;
import by.aaproduction.tpt.controller.command.interfaces.Command;

import java.io.IOException;
import java.util.HashMap;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Connection;
import java.sql.DriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import by.aaproduction.tpt.controller.command.implementation.Register;
import by.aaproduction.tpt.controller.command.implementation.SignIn;
import by.aaproduction.tpt.controller.command.interfaces.Command;

@WebServlet(urlPatterns = {"/Registration", "/Account", "/Login"})
public class AccountServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private HttpSession session;
	private Logger logger;
	
	
	private HashMap<String, Command> commandRepository = new HashMap<>();
	
	public void constructCommandRepository() {
		commandRepository.put("/Login", new SignIn());
		commandRepository.put("/Registration", new Register());
	}
	
    public AccountServlet() {
        super();
        PropertyConfigurator.configure(this.getClass().getClassLoader().getResource("log4j.properties"));
    }

    private HashMap<String, String> doGetHashMap = new HashMap<>();
    
    private void constructdoGetHashMap() {
    	doGetHashMap.put("/Login", "/login.jsp");
    	doGetHashMap.put("/Registration", "/registration.jsp");
    	doGetHashMap.put("/Account", "/editaccount.jsp");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		constructdoGetHashMap();
		String strCommand = request.getServletPath();
		request.getRequestDispatcher(doGetHashMap.get(strCommand)).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		constructCommandRepository();
		String strCommand = request.getServletPath();
		Command command = commandRepository.get(strCommand);
		if (command != null)
			command.execute(request, response);
		doGet(request, response);
	}

	
	
}
