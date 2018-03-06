/*
 * VehicleBuilder.java
 *
 * @version 1.00
 *
 * @since 06 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task5.builder;

import by.epam.task5.moveable.Moveable;
import by.epam.task5.parkable.Parkable;
import by.epam.task5.vehicles.Vehicle;

public class VehicleBuilder {
    Moveable moveBehavior;
    Parkable parkBehavior;

    private int _weight;
    private int _speed;
    private int _colorCode;
    private String _brand = "Generic";
    private int _perDayCost;
    
    public VehicleBuilder() {}

    public Vehicle buildVehicle() {
	return new Vehicle(_weight, _speed, _colorCode, _brand, _perDayCost);
    }

    public VehicleBuilder weight(int _weight) {
	this._weight = _weight;
	return this;
    }

    public VehicleBuilder speed(int _speed) {
	this._speed = _speed;
	return this;
    }

    public VehicleBuilder colorCode(int _colorCode) {
	this._colorCode = _colorCode;
	return this;
    }

    public VehicleBuilder brand(String _brand) {
	this._brand = _brand;
	return this;
    }
    
    public VehicleBuilder perDayCost(int _perDayCost) {
	this._perDayCost = _perDayCost;
	return this;
    }
}
