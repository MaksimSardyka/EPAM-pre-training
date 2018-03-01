/*
 * MotorBoat.java
 *
 * @version 1.00
 *
 * @since 27 February 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task5.vehicles;

import by.epam.task5.fuelable.FuelBehavior;

/**
 * Class of Boat with motor
 *
 * @version 1.00
 * 
 * @since 27 February 2018 ã.
 * 
 * @author Maksim Sardyka
 */
public class MotorBoat extends Boat {
    FuelBehavior fuelBehavior;

    public MotorBoat() {
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

    public FuelBehavior getFuelBehavior() {
	return this.fuelBehavior;
    }
}
