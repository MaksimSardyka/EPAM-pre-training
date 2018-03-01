/*
 * TextBox
 *
 * @version 1.00
 *
 * @since 20 февр. 2018 г.
 *
 * @author Maskim Sardyka
 */

package by.epam.task5.part1;

import by.epam.task5.vehicles.Boat;
import by.epam.task5.vehicles.Car;
import by.epam.task5.vehicles.Vehicle;
import by.epam.task5.view.View;

public class TestBox {
	/**
	 * Test for container class.
	 *
	 * @version 1.00 
	 * @since 20 February 2018
	 * @author Maksim Sardyka
	 */
	public static void main(String ... args) {
		Box<Vehicle> box = new Box<>();
		View.print(box.getSize());
		View.print(box.isEmpty());

		box.addNew(new Car());
		View.print(box.findElementByIndex(0).toString());
		
		box.addNew(new Boat());
		
		Car car = new Car();
		Boat boat = new Boat();
		
		Vehicle [] vehicles = new Vehicle [2];
		vehicles[0]=car;
		vehicles[1]=boat;
		
		
		box.isExists(car); 
		box.findMultipleIndex(boat);
		
		box.addMultipleNew(vehicles);//error
		box.deleteElementByIndex(0);
		
		
		box.clearAll();	
		View.print(box.getSize());
		View.print(box.isEmpty());
	}
}
