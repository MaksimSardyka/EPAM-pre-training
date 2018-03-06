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

import by.epam.task6.interfaces.StackUnlimitedable;

class StackUnlimitedArray<T> extends Adt<T> implements StackUnlimitedable<T> {
    private final int MAX_SIZE = 100;

    /* Constructor */
    public StackUnlimitedArray(int n) {
	arr = (T[]) new Object[n];
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
    public T pop() {
	if (size == arr.length)
	    throw new NoSuchElementException("Underflow Exception");
	return arr[--size];
    }

    /* Function to check the top element of the stack */
    public T peek() {
	if (size == arr.length)
	    throw new NoSuchElementException("Underflow Exception");
	return arr[size - 1];
    }
}