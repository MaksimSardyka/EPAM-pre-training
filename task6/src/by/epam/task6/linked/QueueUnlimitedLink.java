/*
 * Queue.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.linked;

import by.epam.task6.exceptions.ThisElementDidntExistsException;
import by.epam.task6.interfaces.QueueUnlimitedable;

public class QueueUnlimitedLink<T> extends AdtLink<T> implements QueueUnlimitedable<T> {
    /**
     * This is queue(FIFO) implementation
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */
    
    protected Node<T> tail;

    /* Constructor */
    public QueueUnlimitedLink() {
	first = null;
	tail = null;
	size = 0;
    }

    /* Function to insert an element to the queue(in tail) */
    public void enqueue(T data) {
	Node<T> nptr = new Node<T>(data, null);
	if (tail == null) {
	    first = nptr;
	    tail = nptr;
	} else {
	    tail.setLink(nptr);
	    tail = tail.getLink();
	}
	size++;
    }

    /* Function to remove front element from the queue(from first position) */
    public T dequeue() throws ThisElementDidntExistsException {
	if (isEmpty())
	    throw new ThisElementDidntExistsException("Dequeue: queue is empty");
	Node<T> ptr = first;
	first = ptr.getLink();
	if (first == null)
	    tail = null;
	size--;
	return ptr.getData();
    }
}
