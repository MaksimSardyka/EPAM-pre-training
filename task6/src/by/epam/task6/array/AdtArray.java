/*
 * Adt.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.array;

public class AdtArray<T> {
    /**
     * Base class with common for Stack and Queue methods
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */
    protected T arr[];
    protected int size;// number of elements in storage
    protected final int INCREASE_SIZE_STEP = 10;
    protected final int DEFAULT_SIZE = 100;

    /* Function to get the size of the stack */
    public int size() {
	return size;
    }

    /* check if queue is empty */
    public boolean isEmpty() {
	return size == 0;
    }
    
    /* resize */
    protected void resize(int newSize) {
	/*-
	 * Arrays.copyOf can be used instead
	 * this.elements = Arrays.copyOf(this.elements, newSize); 
	 */
	if (newSize > size) {
	    T[] tmp = (T[]) new Object[arr.length];

	    for (int i = 0; i < this.size(); i++) {
		tmp[i] = arr[i];
	    }

	    this.arr = tmp;
	} else if (newSize > arr.length) {
	    T[] tmp = (T[]) new Object[newSize];

	    for (int i = 0; i < this.size(); i++) {
		tmp[i] = arr[i];
	    }

	    this.arr = tmp;
	}
    }
}
