/*
 * BinaryTreeable.java
 *
 * @version 1.00
 *
 * @since 04 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task7.tree;

public interface BinaryTreeable<T extends Object & Comparable<? super T>> {
    void add(T value);

    boolean contains(T value);

    void remove(T value);

    void clear();

    /*
     * post-order clear algorithm - should be used in case we have reference to
     * elements from outside the tree
     */
    void clearSafe();

    int size();

    // traversal
    void inOrder(Node<T> node);

    void preOrder(Node<T> node);

    void postOrder(Node<T> node);
}
