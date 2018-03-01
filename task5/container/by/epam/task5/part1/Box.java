/*
 * Box
 *
 * @version 1.00
 *
 * @since 20 февр. 2018 г.
 *
 * @author Maskim Sardyka
 */

package by.epam.task5.part1;

import by.epam.task5.view.View;

public class Box<T> implements Boxable<T> {
    private final int INITIAL_SIZE = 0;
    private int SIZE_INCREMENT_STEP = 10;

    private T[] storage;
    private int size;

    public Box() {
	this.storage = (T[]) new Object[INITIAL_SIZE];
    }

    public boolean isEmpty() {
	return this.size == 0;
    }

    public int getSize() {
	return size;
    }

    public void addNew(T element) {
	if (size == storage.length) {
	    try {
		changeStorage(storage.length + SIZE_INCREMENT_STEP);
	    } catch (BoxContentCut e) {
		View.print("Some data was removed");
		e.printStackTrace();
	    } catch (BoxSizeLessThanZeroException e) {
		View.print("Wrong array size set, array size is less than zero\n");
		e.printStackTrace();
	    }
	}
	this.storage[size++] = element;
    }

    public void addMultipleNew(T[] elements) {
	if (size + elements.length >= storage.length) {
	    try {
		changeStorage(storage.length + elements.length + SIZE_INCREMENT_STEP);
	    } catch (BoxContentCut e) {
		View.print("Some data was removed");
		e.printStackTrace();
	    } catch (BoxSizeLessThanZeroException e) {
		View.print("Wrong array size set, array size is less than zero\n");
		e.printStackTrace();
	    }

	}

	for (int i = elements.length; i > 0; i--) {
	    this.storage[size + i] = elements[i - 1];
	}

	this.size += elements.length;
    }

    public void deleteElementByIndex(int index) throws IndexOutOfBoundsException {
	if (index >= storage.length || index < 0) {
	    throw new IndexOutOfBoundsException("Item doesn't exist");
	}
	for (int i = index + 1; i < this.size; i++) {
	    this.storage[i] = this.storage[i - 1];
	}
	this.storage[this.size] = null;
    }

    public void clearAll() {
	this.storage = (T[]) new Object[this.storage.length];
    }

    public boolean isExists(T element) {
	boolean flag = false;
	if (!isEmpty()) {
	    for (T cur : this.storage) {
		if (cur.equals(element)) {
		    flag = true;
		    break;
		}
	    }
	}
	return flag;
    }

    public T findElementByIndex(int index) throws IndexOutOfBoundsException {
	if (index >= storage.length || index < 0) {
	    throw new IndexOutOfBoundsException("Item doesn't exist");
	}
	return this.storage[index];
    }

    public int[] findMultipleIndex(T vehicle) {
	int[] indexes = new int[this.size];
	int index = 0;

	for (int i = size - 1; i > 0; i--) {
	    if (storage[i].equals(vehicle)) {
		indexes[index] = i;
		index++;
	    }
	}

	int[] result = new int[indexes.length];
	for (int i = indexes.length - 1; i >= 0; i--) {
	    result[i] = indexes[i];
	}

	return result;
    }

    private void changeStorage(int amounght) throws BoxContentCut, BoxSizeLessThanZeroException {
	if (amounght < 0) {
	    if (storage.length + amounght < 0) {
		throw new BoxSizeLessThanZeroException();
	    } else if (storage.length + amounght <= size) {
		throw new BoxContentCut();
	    }
	    T[] temp = (T[]) new Object[storage.length - 1 + amounght];
	}
	T[] temp = storage;
	storage = (T[]) new Object[storage.length + amounght];

	for (int i = storage.length - 1 - amounght; i >= 0; i--) {
	    storage[i] = temp[i];
	}
    }
}
