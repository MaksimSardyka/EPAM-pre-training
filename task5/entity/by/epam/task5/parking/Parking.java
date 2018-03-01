/*
 * Parking.java
 *
 * @version 1.00
 *
 * @since 27 February 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task5.parking;

import by.epam.task5.part1.Box;
import by.epam.task5.vehicles.Vehicle;

public class Parking {
    private double fuelWasted;
    private double moneyEarned;
    private Box<Vehicle> parking;

    Parking() {
	this.parking = new Box<>();
    }

    /* This methods are used to keep control over fuel amount */
    public double getFuelWasted() {
	return fuelWasted;
    }

    public void fuelSold(double fuelWasted) {
	this.fuelWasted += fuelWasted;
    }

    /* This methods are used to control finance flow */
    public double getMoneyEarned() {
	return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
	this.moneyEarned = moneyEarned;
    }

    public void addMoney(double money) {
	this.moneyEarned += money;
    }

    /* This methods are used to add and remove vehicles from parking */
    public void addNewVehicle(Vehicle vehicle) {
	vehicle.getParkBehavior().park();
	parking.addNew(vehicle);
    }
 
    public void removeFromParking(int index) {
	this.findVehicleByIndex(index).getParkBehavior().unpark();
	parking.deleteElementByIndex(index);
    }

    public Vehicle findVehicleByIndex(int index) {
	return parking.findElementByIndex(index);
    }
    
    public int getAmoungtVehicle(){
	return parking.getSize();
    }
}