/*
 * BoxContentCutException.java
 *
 * @version 1.00
 *
 * @since 28 February 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task5.part1;

import by.epam.task5.view.View;

/**
 * Class description goes here.
 *
 * @version 1.00 
 * 
 * @since 28 February 2018 
 * @author Maksim Sardyka
 */
public class BoxContentCut extends Exception {

    public BoxContentCut() {
	super();
    }

    /**
     * @param message
     * @param cause
     */
    public BoxContentCut(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * @param message
     */
    public BoxContentCut(String message) {
	super(message);
    }

    /**
     * @param cause
     */
    public BoxContentCut(Throwable cause) {
	super(cause);
    }
//    protected BoxContentCut(){
//	View.print("Some data was removed");	
//    }
    
}
