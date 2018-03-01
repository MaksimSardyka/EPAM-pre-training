/*
 * BoxSizeLessThanZeroException.java
 *
 * @version 1.00
 *
 * @since 28 February 2018
 *
 * @author Maskim Sardyka
 */


package by.epam.task5.part1;

public class BoxSizeLessThanZeroException extends Exception {

    /**
     * 
     */
    public BoxSizeLessThanZeroException() {
	super();
    }

    /**
     * @param message
     * @param cause
     */
    public BoxSizeLessThanZeroException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * @param message
     */
    public BoxSizeLessThanZeroException(String message) {
	super(message);
    }

    /**
     * @param cause
     */
    public BoxSizeLessThanZeroException(Throwable cause) {
	super(cause);
    }

}
