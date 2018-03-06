/*
 * Sort.java
 *
 * @version 1.00
 *
 * @since 04 March 2018
 *
 * @author Maskim Sardyka
 */

package task8;

public class Sorter<T extends Object & Comparable<? super T>> {
    /**
     * Sort algorithm implementation
     *
     * @version 1.00
     *
     * @since 04 March 2018
     *
     * @author Maksim Sardyka
     */
    /* Bubble sort - best case O(n), worst - O(N*N) */
    public T[] bubble(T[] arr) {
	boolean flag = true;
	while (flag) {
	    flag = false;
	    for (int i = 1; i < arr.length; i++) {
		if (arr[i].compareTo(arr[i - 1]) < 0) {
		    T temp = arr[i - 1];
		    arr[i - 1] = arr[i];
		    arr[i] = temp;
		    flag = true;
		}
	    }
	}
	return arr;
    }

    /*
     * Function to sort array using insertion sort - O(N) if already sorted(best
     * case), O(n*n) in worst case scenario
     */
    public T[] insertion(T arr[]) {
	for (int i = 1; i < arr.length; ++i) {
	    T key = arr[i];
	    int j = i - 1;

	    /*
	     * Move elements of arr[0..i-1], that are greater than key, to one position
	     * ahead of their current position
	     */
	    while (j >= 0 && key.compareTo(arr[j]) < 0) {
		arr[j + 1] = arr[j];
		j = j - 1;
	    }
	    arr[j + 1] = key;
	}
	return arr;
    }

    /*
     * Function to use for merge sort - O(n logn) - in all 3 cases - I merge array
     * in 2 halves and it takes linear time to merge them
     */

    private T[] mergeSort(T arr[], int left, int medium, int right) {
	/* sub-arrays size */
	int n1 = medium - left + 1;
	int n2 = right - medium;

	/* Temporary arrays: */
	T leftPart[] = (T[]) new Object[n1];
	T rightPart[] = (T[]) new Object[n2];

	/* Copy data to temp arrays */
	for (int i = 0; i < n1; ++i)
	    leftPart[i] = arr[left + i];
	for (int j = 0; j < n2; ++j)
	    rightPart[j] = arr[medium + 1 + j];

	/* Initial indexes of first and second sub-arrays */
	int i = 0, j = 0;

	/* Initial index of merged array */
	int k = left;
	while (i < n1 && j < n2) {
	    if (leftPart[i].compareTo(rightPart[j]) <= 0) {
		arr[k] = leftPart[i];
		i++;
	    } else {
		arr[k] = rightPart[j];
		j++;
	    }
	    k++;
	}

	/* Copy remaining elements of leftPart[] if any */
	while (i < n1) {
	    arr[k] = leftPart[i];
	    i++;
	    k++;
	}

	/* Copy remaining elements of rightPart[] if any */
	while (j < n2) {
	    arr[k] = rightPart[j];
	    j++;
	    k++;
	}
	return arr;
    }

    public T[] merge(T arr[], int left, int right) {
	if (left < right) {
	    // Find the medium point
	    int medium = (left + right) / 2;

	    // Sort left and right part
	    merge(arr, left, medium);
	    merge(arr, medium + 1, right);

	    // Merge the sorted parts
	    arr = mergeSort(arr, left, medium, right);
	}
	return arr;
    }

    /* Function to sort array using selection sort - O(N*N) */
    public T[] selection(T arr[]) {
	// One by one move boundary of unsorted subarray
	for (int i = 0; i < arr.length - 1; i++) {
	    // Find the minimum element in unsorted array
	    int min_idx = i;
	    for (int j = i + 1; j < arr.length; j++)
		if (arr[j].compareTo(arr[min_idx]) < 0)
		    min_idx = j;

	    // Swap the found minimum element with the first
	    // element
	    T temp = arr[min_idx];
	    arr[min_idx] = arr[i];
	    arr[i] = temp;
	}
	return arr;
    }

    /* Quick sort recursive implementation - worst case scenario O(N*N) */
    private int partition(T arr[], int left, int right)
    {
        T pivot = arr[right]; 
        int i = (left-1); 			// index of smaller element
        for (int j=left; j<right; j++)
        {
            if (arr[j].compareTo(pivot) <=0)
            {
                i++;
 
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        T temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
 
        return i+1;
    }
 
    private T[] quickRecursive(T arr[], int left, int right)
    {
        if (left < right)
        {
            /* arr[i] now on right place */
            int i = partition(arr, left, right);
 
            /* Recursive by elements before and after */
            quickRecursive(arr, left, i-1);
            quickRecursive(arr, i+1, right);
        }
        return arr;
    }
    
    public T[] quick (T arr[]) {
	return quickRecursive(arr,0, arr.length-1);
    }
}
