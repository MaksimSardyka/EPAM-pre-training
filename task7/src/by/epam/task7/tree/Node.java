/*
 * Node.java
 *
 * @version 1.00
 *
 * @since 04 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task7.tree;

public class Node<T extends Object & Comparable<? super T>> {
    /**
     * Node element
     *
     * @version 1.00
     *
     * @since 04 March 2018
     *
     * @author Maksim Sardyka
     */
    T value;
    Node<T> left;
    Node<T> right;

    Node(T value) {
	this.value = value;
	right = null;
	left = null;
    }

    public T getValue() {
	return this.value;
    }

}