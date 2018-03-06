/*
 * Node.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.linked;

public class Node<T> {
    /**
     * Class description goes here.
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */
    /* Class Node */
    private T data;
    private Node<T> link;

    /* Constructor */
    public Node() {
	link = null;
	data = null;
    }

    /* Constructor */
    public Node(T d, Node<T> n) {
	data = d;
	link = n;
    }

    /* Function to set link to next Node */
    public void setLink(Node<T> n) {
	link = n;
    }

    /* Function to set data to current Node */
    public void setData(T d) {
	data = d;
    }

    /* Function to get link to next node */
    public Node<T> getLink() {
	return link;
    }

    /* Function to get data from current Node */
    public T getData() {
	return data;
    }
}