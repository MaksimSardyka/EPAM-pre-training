/*
 * Controller.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task6.controller;

import java.util.Random;

import by.epam.task5.builder.VehicleBuilder;
import by.epam.task5.vehicles.Vehicle;
import by.epam.task6.array.*;
import by.epam.task6.exceptions.ThisElementDidntExistsException;
import by.epam.task6.linked.*;
import by.epam.task6.view.View;

public class Controller {
    /**
     * test for stack and queue classes
     *
     * @version 1.00
     *
     * @since 06 March 2018
     *
     * @author Maksim Sardyka
     */
    
    public static void main(String[] args) {

	int numberOfElements = 100;
	
	/* Test one of stack implementations: */
	StackUnlimitedArray<Vehicle> carStack = new StackUnlimitedArray<Vehicle>();
	/* Create test array with random elements */
	for (int i = numberOfElements - 1; i >= 0; i--) {
	    carStack.push(new VehicleBuilder().buildVehicle());
	}
	
	for (int i = numberOfElements - 1; i >= 0; i--) {
	    try {
		View.print("Stack element:" + (100-i) +")"+carStack.pop()+"/n");
	    } catch (ThisElementDidntExistsException e) {
		e.printStackTrace();
	    }
	}
	
	/* Test one of queue implementations: */
	QueueUnlimitedLink<Vehicle> carQueue = new QueueUnlimitedLink<Vehicle>();
	/* Create test array with random elements */
	for (int i = numberOfElements - 1; i >= 0; i--) {
	    carQueue.enqueue(new VehicleBuilder().buildVehicle());
	}
	
	for (int i = numberOfElements - 1; i >= 0; i--) {
	    try {
		View.print("Queue element:" + (100-i) +")"+carQueue.dequeue());
	    } catch (ThisElementDidntExistsException e) {
		e.printStackTrace();
	    }
	}
	
    }
}
