/*
 * Boxable<T>
 *
 * @version 1.00
 *
 * @since 21 February 2018
 *
 * @author Maskim Sardyka
 */


package by.epam.task5.part2;
/**
 * Box<T> interface for parameterized container
 *
 * @version 1.00
 * 
 * @since 20 February 2018
 * 
 * @author Maksim Sardyka
 */
interface Boxable2<T> {
    	/* Check is this container is empty */
	boolean isEmpty();
	/* Return number of elements in this container */
	int getSize();
	
	/* Used to add elements in container */
	void addNew(T element);						//for only 1 element
	void addMultipleNew(T[] elements);					//for multiple elements
	
	/* Removes elements from container */
	T deleteElementByIndex(int index) throws DidntExistsException; 	//for one specific element
	void clearAll();							//remove all elements
	
	/* Check is this element in container */
	boolean isExists(T element);
	/* Return array element with specified index */
	T findElementByIndex(int index) throws DidntExistsException;

}

