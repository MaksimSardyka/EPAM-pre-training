/*
 * Car.java
 *
 * @version 1.00 
 *
 * 18 February 2018
 *
 * @author Maksim Sardyka 
 */

package by.epam.task5.vehicles;

import by.epam.task5.fuelable.FuelBehavior;
import by.epam.task5.moveable.Move;
import by.epam.task5.parkable.InParking;

/**
 * Class of Car entity
 *
 * @version 1.00 18 February 2018
 * @author Maksim Sardyka
 */
public class Car extends Vehicle {
    private int numberOfWheels;
    private String carClass = "Unset";
    private FuelBehavior fuelBehavior;

    public Car() {
	this.moveBehavior = new Move("Drive on the road\n");
	this.parkBehavior = new InParking();
	/*
	 * FuelBehavior() - this is constructor for fuel behavior(fuel waste and refill)
	 * 
	 * @param tankMaxVolume volume of fuel tank
	 * 
	 * @param fuelVolume current fuel quantity
	 * 
	 * @param fuelPerKm waste of gasoline per kilometer
	 */
	this.fuelBehavior = new FuelBehavior();
    }

    /**
     * @param numberOfWheels
     * @param carClass
     * @param fuelBehavior
     */
    public Car(int numberOfWheels, String carClass, FuelBehavior fuelBehavior) {
	super();
	this.numberOfWheels = numberOfWheels;
	this.carClass = carClass;
	this.fuelBehavior = fuelBehavior;
    }

    /**
     * @param car
     */
    public Car(Car car) {
	this.numberOfWheels = car.getNumberOfWheels();
	this.setParkBehavior(car.getParkBehavior());
	this.setMoveBehavior(car.getMoveBehavior());
    }

    public int getNumberOfWheels() {
	return numberOfWheels;
    }

    /**
     * @param numberOfWheels
     */
    public void setNumberOfWheels(int numberOfWheels) {
	this.numberOfWheels = numberOfWheels;
    }

    public String getCarClass() {
	return carClass;
    }

    /**
     * @param carClass
     */
    public void setCarClass(String carClass) {
	this.carClass = carClass;
    }
    
    public FuelBehavior getFuelBehavior() {
	return this.fuelBehavior;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((carClass == null) ? 0 : carClass.hashCode());
	result = prime * result + ((fuelBehavior == null) ? 0 : fuelBehavior.hashCode());
	result = prime * result + numberOfWheels;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Car other = (Car) obj;
	if (carClass == null) {
	    if (other.carClass != null)
		return false;
	} else if (!carClass.equals(other.carClass))
	    return false;
	if (fuelBehavior == null) {
	    if (other.fuelBehavior != null)
		return false;
	} else if (!fuelBehavior.equals(other.fuelBehavior))
	    return false;
	if (numberOfWheels != other.numberOfWheels)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Car [numberOfWheels=" + numberOfWheels + ", carClass=" + carClass;
    }

}
