/*
 * Fuelable
 *
 * @version 1.00
 *
 * @since 27 February 2018
 *
 * @author Maksim Sardyka
 */

package by.epam.task5.fuelable;

public interface Fuelable {
    /*
     * @param fuelPerDistance amount of fuel per kilometer/mile/etc
     * */
    void setFuelPerDistance(double fuelPerDistance);
    void setFuelVolume(double fuelVolume);
    void setTankMaxVolume(double tankMaxVolume);
    
    /*
     * @param addVolume amount of fuel to fill in tank
     * */
    double addFuel(double addVolume);
    
    double getFuelVolume();
    double getFuelPerDistance();
    double getTankMaxVolume();
}
