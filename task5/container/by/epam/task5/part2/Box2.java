/*
 * Box2
 *
 * @version 1.00
 *
 * @since 20 February 2018 ã.
 *
 * @author Maskim Sardyka
 */

package by.epam.task5.part2;

import java.util.Arrays;

public class Box2<T> implements Boxable2<T> {
    private final int INITIAL_SIZE = 8;
    private final int INCREASE_STORAGE_MULTIPLIER = 2;

    private T[] storage;
    private int size = 0;

    public Box2() {
	storage = (T[]) new Object[INITIAL_SIZE];
    }

    @Override
    public boolean isEmpty() {
	return this.size == 0;
    }

    @Override
    public int getSize() {
	return this.size;
    }

    @Override
    public void addNew(T element) {
	if (storage.length - size <= 5) {
	    changeStorage();
	}
	storage[size++] = element;
    }

    @Override
    public void addMultipleNew(T[] elements) {
	for (T element : elements) {
	    addNew(element);
	}
    }

    @Override
    public T deleteElementByIndex(int index) throws DidntExistsException {
	if (index < size) {
	    T element = storage[index];
	    storage[index] = null;
	    int temp = index;
	    while (temp < size) {
		storage[temp] = storage[temp + 1];
		storage[temp + 1] = null;
		temp++;
	    }
	    size--;
	    return element;
	} else {
	    throw new DidntExistsException("This index is too big\n");
	}

    }

    @Override
    public T findElementByIndex(int index) throws DidntExistsException {
	if (index < size) {
	    return storage[index];
	} else {
	    throw new DidntExistsException("This index is too big\n");
	}
    }

    private void changeStorage() {
	this.storage = Arrays.copyOf(storage, storage.length * INCREASE_STORAGE_MULTIPLIER);
    }

    @Override
    public void clearAll() {
	this.storage = (T[]) new Object[INITIAL_SIZE];
	this.size = 0;
    }

    @Override
    public boolean isExists(T element) {
	for (T current : this.storage) {
	    if (current.equals(element)) {
		return true;
	    }
	}
	return false;
    }
}
