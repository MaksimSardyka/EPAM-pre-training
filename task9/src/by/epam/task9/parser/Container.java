/*
 * Text.java
 *
 * @version 1.00
 *
 * @since 09 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task9.parser;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Container<StoredDataType> implements Iterable<StoredDataType> {
    /**
     * Class description goes here.
     *
     * @version 1.00
     *
     * @since 09 March 2018
     *
     * @author Maksim Sardyka
     */
    StoredDataType[] data;

    Container(){
	
    }
    
    public int getSize() {
	return data.length;
    }

    public StoredDataType getData(int index) {
	return data[index];
    }

    @Override
    public Iterator<StoredDataType> iterator() {
	return new TextIterator();
    }

    private class TextIterator implements Iterator<StoredDataType> {
	private int cursor;

	public TextIterator() {
	    this.cursor = 0;
	}

	public boolean hasNext() {
	    return this.cursor < data.length;
	}

	public StoredDataType next() {
	    if (this.hasNext()) {
		int current = cursor;
		cursor++;
		return data[current];
	    }
	    throw new NoSuchElementException();
	}

	public void remove() {
	    throw new UnsupportedOperationException();
	}
    }
}
