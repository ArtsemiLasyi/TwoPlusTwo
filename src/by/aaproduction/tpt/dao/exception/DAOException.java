/**
 * 
 */
package by.aaproduction.tpt.dao.exception;

/**
 * @author Artsemy
 *
 */
public class DAOException extends Exception {

	private static final long  serialVersionUID = 1L;
	
	public DAOException() {
		super();
	}
	
	public DAOException(String message) { 
		super(message);
	}
	
	public DAOException(Exception ex) {
		super(ex);
	}
	
	public DAOException(String message, Exception ex) {
		super(message, ex);
	}
}
