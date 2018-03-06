/*
 * Stack.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.array;

//public class Stack<T> extends Adt<T> implements StackLinkedUnlimitedable<T>{

import java.util.*;

import by.epam.task6.exceptions.ThisElementDidntExistsException;
import by.epam.task6.interfaces.StackUnlimitedable;

public class StackUnlimitedArray<T> extends AdtArray<T> implements StackUnlimitedable<T> {
    /* Constructor */
    public StackUnlimitedArray() {
	arr = (T[]) new Object[DEFAULT_SIZE];
    }

    /* Function to add an element to the stack */
    public void push(T element) {
	if (size == arr.length) {
	    resize(size + INCREASE_SIZE_STEP);
	} else if (size < arr.length) {
	    arr[size++] = element;
	}
    }

    /* Function to delete an element from the stack */
    public T pop() throws ThisElementDidntExistsException {
	if (size == 0)
	    throw new ThisElementDidntExistsException("Pop: stack is empty");
	return arr[--size];
    }

    /* Function to check the top element of the stack */
    public T peek() throws ThisElementDidntExistsException {
	if (size == 0)
	    throw new ThisElementDidntExistsException("Peek: stack is empty");
	return arr[size - 1];
    }
}