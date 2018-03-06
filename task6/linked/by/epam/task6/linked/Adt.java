/*
 * Adt.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.linked;

import by.epam.task6.exceptions.ThisElementDidntExistsException;

public class Adt<T> {
    /**
     * Base class with common for Stack and Queue methods
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */
    public int size;// number of elements in storage
    protected Node<T> first;

    /* return first element without deleting it */
    public T peek() throws ThisElementDidntExistsException {
	if (isEmpty())
	    throw new ThisElementDidntExistsException("Peek: list of elements is empty");
	return first.getData();
    }
    
    /* Function to get the size of the stack */
    public int size() {
	return size;
    }

    /* check if queue is empty */
    public boolean isEmpty() {
	return first == null;
    }
}
