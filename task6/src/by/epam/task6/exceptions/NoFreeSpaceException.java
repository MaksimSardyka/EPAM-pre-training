/*
 * NoFreeSpaceException.java
 *
 * @version 1.00
 *
 * @since 05 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.exceptions;

public class NoFreeSpaceException extends Exception {

    public NoFreeSpaceException() {
	super();
    }

    /**
     * @param message
     * @param cause
     */
    public NoFreeSpaceException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * @param message
     */
    public NoFreeSpaceException(String message) {
	super(message);
    }

    /**
     * @param cause
     */
    public NoFreeSpaceException(Throwable cause) {
	super(cause);
    }
}
