/*
 * Stack.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.linked;

import by.epam.task6.exceptions.ThisElementDidntExistsException;
import by.epam.task6.interfaces.StackUnlimitedable;

public class StackUnlimitedLink<T> extends AdtLink<T> implements StackUnlimitedable<T>{
    /**
     * Class description goes here.
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */

    /* Constructor */
    public StackUnlimitedLink() {
	first = null;
	size = 0;
    }

    /* Function to push an element to the stack */
    public void push(T data) {
	Node<T> nptr = new Node<T>(data, null);
	if (first == null)
	    first = nptr;
	else {
	    nptr.setLink(first);
	    first = nptr;
	}
	size++;
    }

    /* Function to pop an element from the stack */
    public T pop() throws ThisElementDidntExistsException  {
	if (isEmpty())
	    throw new ThisElementDidntExistsException("Pop: list is empty");
	Node<T> ptr = first;
	first = ptr.getLink();
	size--;
	return ptr.getData();
    }

//  /* Function to display the status of the stack */
//  public void display() {
//	System.out.print("\nStack = ");
//	if (size == 0) {
//	    System.out.print("Empty\n");
//	    return;
//	}
//	Node<T> ptr = top;
//	while (ptr != null) {
//	    System.out.print(ptr.getData() + " ");
//	    ptr = ptr.getLink();
//	}
//	System.out.println();
//  }
}
