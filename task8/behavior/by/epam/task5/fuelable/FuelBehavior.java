/*
 * FuelBehavior.java
 *
 * @version 1.00
 *
 * @since 01 March 2018
 *
 * @author Maskim Sardyka
 */


package by.epam.task5.fuelable;

public class FuelBehavior implements Fuelable{
    private double tankMaxVolume;
    private double fuelVolume;
    private double fuelPerDistance;

    @Override
    public double addFuel(double addVolume) {
	double leftover = 0;

	if (fuelVolume + addVolume > tankMaxVolume) {
	    leftover = fuelVolume + addVolume - tankMaxVolume;
	    fuelVolume = tankMaxVolume;
	}

	return leftover;
    }

    @Override
    public double getFuelVolume() {
	return fuelVolume;
    }
    
    @Override
    public double getTankMaxVolume() {
	return tankMaxVolume;
    }

    @Override
    public double getFuelPerDistance() {
	return fuelPerDistance;
    }
    
    @Override
    public void setFuelPerDistance(double fuelPerDistance) {
	this.fuelPerDistance = fuelPerDistance;
    }

    @Override
    public void setFuelVolume(double fuelVolume) {
	this.fuelVolume= fuelVolume;
    }

    @Override
    public void setTankMaxVolume(double tankMaxVolume) {
	this.tankMaxVolume = tankMaxVolume;
    }
}
