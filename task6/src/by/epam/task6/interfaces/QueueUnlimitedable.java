/*
 *  QueueLinkedUnlimited.java
 *
 * @version 1.00
 *
 * @since 05 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.interfaces;

import by.epam.task6.exceptions.NoFreeSpaceException;
import by.epam.task6.exceptions.ThisElementDidntExistsException;

public interface QueueUnlimitedable<T> {
    void enqueue(T newElement) throws NoFreeSpaceException;

    T dequeue() throws ThisElementDidntExistsException;

    T peek() throws ThisElementDidntExistsException;

    int size();

    boolean isEmpty();
}
