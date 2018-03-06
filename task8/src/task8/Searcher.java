/*
 * Searcher.java
 *
 * @version 1.00
 *
 * @since 05 March 2018
 *
 * @author Maskim Sardyka
 */

package task8;

public class Searcher<T extends Object & Comparable<? super T>> {
    /**
     * Search algorithm implementation
     *
     * @version 1.00
     *
     * @since 05 March 2018
     *
     * @author Maksim Sardyka
     */

    /*
     * linear or sequential search(as our algorithm consist of 1 loop - worst case
     * scenario O(N)
     */
    public int linear(T arr[], T value) {
	int result = -1;
	for (int i = arr.length - 1; i >= 0; i--) {
	    if (arr[i].compareTo(value) == 0) {
		result = i;
		break;
	    }
	}
	return result;
    }

    /*
     * binary search iterative implementation array already must be sorted for this
     * search O(log(N))
     */
    public int binarySearchIterative(T[] sortedArray, T value, int left, int right) {
	int index = Integer.MAX_VALUE;

	while (left <= right) {
	    int medium = (left + right) / 2;
	    if (sortedArray[medium].compareTo(value) < 0) {
		left = medium + 1;
	    } else if (value.compareTo(sortedArray[medium]) < 0) {
		right = medium - 1;
	    } else if (sortedArray[medium] == value) {
		index = medium;
		break;
	    }
	}
	return index;
    }
}
