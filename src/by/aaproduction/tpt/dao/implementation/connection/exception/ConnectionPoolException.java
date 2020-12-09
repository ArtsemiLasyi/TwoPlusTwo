/**
 * 
 */
package by.aaproduction.tpt.dao.implementation.connection.exception;

/**
 * @author Artsemy
 *
 */

public class ConnectionPoolException extends Exception {
	
	private static final long  serialVersionUID = 1L;
	
    public ConnectionPoolException(String message, Exception e) {
        super(message, e);
    }

    public ConnectionPoolException() {
        super();
    }

    public ConnectionPoolException(String message) {
        super(message);
    }

    public ConnectionPoolException(Throwable cause) {
        super(cause);
    }
}