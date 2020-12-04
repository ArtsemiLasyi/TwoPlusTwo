package by.aaproduction.tpt.controller;

import java.io.IOException;

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

import by.aaproduction.tpt.controller.Configuration;

@WebServlet("/Account")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AccountServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        try {
        	Configuration conf = new Configuration();
            String url = conf.getUrl();
            String username = conf.getUsername();
            String password = conf.getPassword();
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
            	request.getRequestDispatcher("/registration.jsp").forward(request, response);
            }
        }
        catch(Exception ex) {
 	
        }
        finally {
        }
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
 
        String name = request.getParameter("userName");
        String surname = request.getParameter("userSurname");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        writer.write(name);
	}

}
