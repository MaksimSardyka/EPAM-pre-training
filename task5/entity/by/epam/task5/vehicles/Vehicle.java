/*
 * Vehicle
 *
 * @version 1.00
 *
 * 23 Feb 2018
 *
 * @author Maksim Sardyka
 */

package by.epam.task5.vehicles;

import by.epam.task5.moveable.Moveable;
import by.epam.task5.parkable.Parkable;

public class Vehicle {

    Moveable moveBehavior;
    Parkable parkBehavior;

    private int weight;
    private int speed;
    private int colorCode;
    private String brand = "Generic";

    private int perDayCost;

    Vehicle() {
    }

    /**
     * @param weight
     * @param speed
     * @param colorCode
     * @param brand
     */
    public Vehicle(int weight, int speed, int colorCode, String brand) {
	super();
	this.weight = weight;
	this.speed = speed;
	this.colorCode = colorCode;
	this.brand = brand;
    }

    public Moveable getMoveBehavior() {
	return this.moveBehavior;
    }

    public Parkable getParkBehavior() {
	return this.parkBehavior;
    }

    public void setMoveBehavior(Moveable moveBehavior) {
	this.moveBehavior = moveBehavior;
    }

    public void setParkBehavior(Parkable parkBehavior) {
	this.parkBehavior = parkBehavior;
    }

    public int getWeight() {
	return weight;
    }

    public void setWeight(int weight) {
	this.weight = weight;
    }

    public int getSpeed() {
	return speed;
    }

    public void setSpeed(int speed) {
	this.speed = speed;
    }

    public int getColorCode() {
	return colorCode;
    }

    public void setColorCode(int colorCode) {
	this.colorCode = colorCode;
    }

    public String getBrand() {
	return brand;
    }

    public void setBrand(String brand) {
	this.brand = brand;
    }

    public int getPerDayCost() {
	return perDayCost;
    }

    public void setPerDayCost(int perDayCost) {
	this.perDayCost = perDayCost;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + colorCode;
	result = prime * result + ((moveBehavior == null) ? 0 : moveBehavior.hashCode());
	result = prime * result + ((parkBehavior == null) ? 0 : parkBehavior.hashCode());
	result = prime * result + perDayCost;
	result = prime * result + speed;
	result = prime * result + weight;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Vehicle other = (Vehicle) obj;
	if (brand == null) {
	    if (other.brand != null)
		return false;
	} else if (!brand.equals(other.brand))
	    return false;
	if (colorCode != other.colorCode)
	    return false;
	if (moveBehavior == null) {
	    if (other.moveBehavior != null)
		return false;
	} else if (!moveBehavior.equals(other.moveBehavior))
	    return false;
	if (parkBehavior == null) {
	    if (other.parkBehavior != null)
		return false;
	} else if (!parkBehavior.equals(other.parkBehavior))
	    return false;
	if (perDayCost != other.perDayCost)
	    return false;
	if (speed != other.speed)
	    return false;
	if (weight != other.weight)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Vehicle [weight=" + weight + ", speed=" + speed + ", colorCode=" + colorCode + ", brand=" + brand
		+ ", perDayCost=" + perDayCost + "]";
    }
}
