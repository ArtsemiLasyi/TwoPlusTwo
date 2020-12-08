package by.aaproduction.tpt.controller;

import java.util.HashMap;

import by.aaproduction.tpt.controller.command.implementation.Register;
import by.aaproduction.tpt.controller.command.implementation.SignIn;
import by.aaproduction.tpt.controller.command.implementation.ChangeLanguage;
import by.aaproduction.tpt.controller.command.interfaces.Command;

public class Controller {
	
	private static final Controller instance = new Controller();
	
	private HashMap<String, Command> commandRepository = new HashMap<>();
	
	private HashMap<String, String> doGetHashMap = new HashMap<>();
	
	public static Controller getInstance() {
		return instance;
	}
	
	public Controller() {
		constructdoGetHashMap();
		constructCommandRepository();
	}
	
	public Command getCommand(String strCommand) {
		return commandRepository.get(strCommand);
	}
	
	public String getPage(String strPage) {
		return doGetHashMap.get(strPage);
	}
	
	private void constructCommandRepository() {
		commandRepository.put("/Main", new ChangeLanguage());
		commandRepository.put("/Login", new SignIn());
		commandRepository.put("/Registration", new Register());
	}

    
    
    private void constructdoGetHashMap() {
    	doGetHashMap.put("/Login", "/login.jsp");
    	doGetHashMap.put("/Registration", "/registration.jsp");
    	doGetHashMap.put("/Account", "/editaccount.jsp");
    	doGetHashMap.put("/Main", "/index.jsp");
    }

}
