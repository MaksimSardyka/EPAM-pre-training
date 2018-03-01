/*
 * DidntExistsException.java
 *
 * @version 1.00
 *
 * @since 01 March 2018
 *
 * @author Maskim Sardyka
 */


package by.epam.task5.part2;

public class DidntExistsException extends Exception {

    public DidntExistsException() {
	super();
    }

    /**
     * @param message
     * @param cause
     */
    public DidntExistsException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * @param message
     */
    public DidntExistsException(String message) {
	super(message);
    }

    /**
     * @param cause
     */
    public DidntExistsException(Throwable cause) {
	super(cause);
    }

}
