/*
 * StackLinkedUnlimitedable.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.interfaces;

import by.epam.task6.exceptions.NoFreeSpaceException;
import by.epam.task6.exceptions.ThisElementDidntExistsException;

public interface StackUnlimitedable<T> {
    /*
     * StackLinkedUnlimitedable.java
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maskim Sardyka
     */

    /* add element in array */
    public void push(T newElement) throws NoFreeSpaceException;

    /* get + remove first element in array */
    public T pop() throws ThisElementDidntExistsException;

    /* get first element */
    public T peek() throws ThisElementDidntExistsException;

    /* get number of elements in stack */
    public int size();

    /* check if stack is empty */
    public boolean isEmpty();
}
