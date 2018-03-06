/*
 * NoSuchElementException.java
 *
 * @version 1.00
 *
 * @since 05 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.exceptions;

public class ThisElementDidntExistsException extends Exception {
    /**
     * Class description goes here.
     *
     * @version 1.00
     *
     * @since 05 March 2018
     *
     * @author Maksim Sardyka
     */

    /**
     * 
     */
    public ThisElementDidntExistsException() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public ThisElementDidntExistsException(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public ThisElementDidntExistsException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public ThisElementDidntExistsException(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
    }
}
