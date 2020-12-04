package by.aaproduction.tpt.dao.interfaces;

import by.aaproduction.tpt.dao.bean.User;

public interface UserDAO {
	
	void signIn(String login, String password);
	
	void registration(User user);
}
