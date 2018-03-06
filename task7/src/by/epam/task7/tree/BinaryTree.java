/*
 * BinaryTree.java
 *
 * @version 1.00
 *
 * @since 04 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task7.tree;

public class BinaryTree<T extends Object & Comparable<? super T>> implements BinaryTreeable<T> {
    /**
     * Binary tree implementation
     *
     * @version 1.00
     *
     * @since 04 March 2018
     *
     * @author Maksim Sardyka
     */

    private Node<T> root;

    @Override
    public void add(T value) {
	root = addRecursive(root, value);
    }

    /*
     * This method is used for adding element in recursive way
     */
    private Node<T> addRecursive(Node<T> current, T value) {
	/* If current element is root - assign value to it */
	if (current == null) {
	    return new Node<T>(value);
	}
	/* Otherwise - continue moving down the tree till find the right place */
	if (value.compareTo(current.value) < 0) {
	    current.left = addRecursive(current.left, value);
	} else if (value.compareTo(current.value) > 0) {
	    current.right = addRecursive(current.right, value);
	}

	/* if this point reached - this value already in the tree (current == value) */
	return current;
    }

    @Override
    public boolean contains(T value) {
	return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node<T> current, T value) {
	if (current == null) {
	    return false;
	}

	if (value == current.value) {
	    return true;
	}

	return value.compareTo(current.value) < 0 ? containsRecursive(current.left, value)
		: containsRecursive(current.right, value);
    }

    @Override
    public void remove(T value) {
	removeRecursive(root, value);
    }

    private Node<T> removeRecursive(Node<T> current, T value) {
	if (current == null) {
	    return null;
	}

	if (value == current.value) {
	    // Case 1: no children
	    if (current.left == null && current.right == null) {
		return null;
	    }

	    // Case 2: only 1 child
	    if (current.right == null) {
		return current.left;
	    }

	    if (current.left == null) {
		return current.right;
	    }

	    // Case 3: 2 children
	    T smallestValue = findSmallestValue(current.right);
	    current.value = smallestValue;
	    current.right = removeRecursive(current.right, smallestValue);
	    return current;
	}
	if (value.compareTo(current.value) < 0) {
	    current.left = removeRecursive(current.left, value);
	    return current;
	}

	current.right = removeRecursive(current.right, value);
	return current;
    }

    private T findSmallestValue(Node<T> root) {
	return root.left == null ? root.value : findSmallestValue(root.left);
    }

    @Override
    public void inOrder(Node<T> node) {
	if (node != null) {
	    inOrder(node.left);
	    System.out.print(" " + node.value);
	    inOrder(node.right);
	}
    }

    @Override
    public void preOrder(Node<T> node) {
	if (node != null) {
	    System.out.print(" " + node.value);
	    preOrder(node.left);
	    preOrder(node.right);
	}
    }

    @Override
    public void postOrder(Node<T> node) {
	if (node != null) {
	    postOrder(node.left);
	    postOrder(node.right);
	    System.out.print(" " + node.value);
	}
    }

    @Override
    public void clear() {
	this.root = null;
    }

    /*
     * pos-order clean algorithm - should be used in case we have reference to
     * elements from outside the tree
     */
    @Override
    public void clearSafe() {
	clearRecursive(this.root);
    }

    void clearRecursive(Node<T> node) {
	if (node != null) {
	    clearRecursive(node.left);
	    clearRecursive(node.right);
	    node = null;
	}
    }

    @Override
    public int size() {
	return sizeRecursive(root);
    }

    private int sizeRecursive(Node<T> current) {
	return current == null ? 0 : sizeRecursive(current.left) + 1 + sizeRecursive(current.right);
    }

    public Node<T> getRoot() {
	return root;
    }
}
