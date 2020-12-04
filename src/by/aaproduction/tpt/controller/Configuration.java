/**
 * 
 */
package by.aaproduction.tpt.controller;

/**
 * @author Artsemy
 *
 */
public class Configuration {
	private String url = "jdbc:mysql://localhost/twoplustwo?allowPublicKeyRetrieval=true&serverTimezone=Europe/Moscow&useSSL=false";
    private String username = "root";
    private String password = "v5r9c001pa55w0r4";
    
    public String getUrl() {
    	return url;
    }
    
    public String getUsername() {
    	return username;
    }
    
    public String getPassword() {
    	return password;
    }
}
