/*
 * Main.java
 *
 * @version 1.00
 *
 * @since 04 March 2018
 *
 * @author Maskim Sardyka
 */

package task8;

import java.util.Random;
import by.epam.task5.vehicles.Vehicle;
import by.epam.task5.view.View;
import by.epam.task5.builder.VehicleBuilder;

public class Main {
    /**
     * Main test class
     *
     * @version 1.00
     *
     * @since 04 March 2018
     *
     * @author Maksim Sardyka
     */
    public static void main(String[] args) {
	Random rand = new Random();
	Sorter<Vehicle> sort = new Sorter<Vehicle>();
	Searcher<Vehicle> search = new Searcher<Vehicle>();
	Vehicle[] arr = new Vehicle[100];

	/* Create test array with random elements */
	for (int i = 100 - 1; i >= 0; i--) {
	    arr[i] = new VehicleBuilder().perDayCost(rand.nextInt(100)).buildVehicle();
	}

	StringBuilder result = new StringBuilder();
	result.append("-Sort");

	/* test bubble sort */
	result.append("\nBubble:\n");
	arr = sort.bubble(arr);
	for (int i = 0; i < 100; i++) {
	    result.append(arr[i].getPerDayCost() + " ");
	}
	/* Reassign random values */
	for (int i = 100 - 1; i >= 0; i--) {
	    arr[i].setPerDayCost(rand.nextInt(100));
	}

	/* test insertion sort */
	result.append("\nInsertion:\n");
	sort.insertion(arr);
	for (int i = 0; i < 100; i++) {
	    result.append(arr[i].getPerDayCost() + " ");
	}
	/* Reassign random values */
	for (int i = 100 - 1; i >= 0; i--) {
	    arr[i].setPerDayCost(rand.nextInt(100));
	}

	/* test selection sort */
	result.append("\nSelection:\n");
	sort.selection(arr);
	for (int i = 0; i < 100; i++) {
	    result.append(arr[i].getPerDayCost() + " ");
	}
	/* Reassign random values */
	for (int i = 100 - 1; i >= 0; i--) {
	    arr[i].setPerDayCost(rand.nextInt(100));
	}

	/* test merge sort */
	result.append("\nMerge:\n");
	sort.merge(arr, 0, arr.length - 1);
	for (int i = 0; i < 100; i++) {
	    result.append(arr[i].getPerDayCost() + " ");
	}
	/* Reassign random values */
	for (int i = 100 - 1; i >= 0; i--) {
	    arr[i].setPerDayCost(rand.nextInt(100));
	}

	/* test quick sort */
	result.append("\nQuick:\n");
	sort.quick(arr);
	for (int i = 0; i < 100; i++) {
	    result.append(arr[i].getPerDayCost() + " ");
	}

	result.append("\n-Search\n");
	/* linear search */
	int index = rand.nextInt(100);
	result.append("Linear: value " + arr[index] + " should exist\n");
	index = search.linear(arr, arr[index]);
	result.append(
		"Result: " + (index != -1 ? arr[index] + " on " + index + " position \n" : "Element not found\n"));

	/* binary search iterative */
	index = rand.nextInt(100);
	result.append("Binary iterative: value " + arr[index] + " should exist\n");
	index = search.binarySearchIterative(arr, arr[index], 0, arr.length - 1);
	result.append(
		"Result: " + (index != -1 ? arr[index] + " on " + index + " position \n" : "Element not found\n"));

	View.print(result.toString());
    }
}
