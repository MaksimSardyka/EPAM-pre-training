/*
 * Boat.java
 *
 * @version 1.00
 *
 * 27 February
 *
 * @author Maksim Sardyka
 */

package by.epam.task5.vehicles;

import by.epam.task5.moveable.Move;
import by.epam.task5.parkable.InDock;

public class Boat extends Vehicle {
    private int numberMast;

    public Boat() {
	this.moveBehavior = new Move("Sail/n");
	this.parkBehavior = new InDock();
    }

    /**
     * @param numberMast
     * @param fuelBehavior
     */
    public Boat(int numberMast) {
	super();
	this.numberMast = numberMast;
    }

    public Boat(Boat boat) {
	this.numberMast = boat.getNumberMast();
	this.moveBehavior = boat.getMoveBehavior();
	this.parkBehavior = boat.getParkBehavior();
    }

    public int getNumberMast() {
	return numberMast;
    }

    public void setNumberMast(int numberOfMast) {
	this.numberMast = numberOfMast;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + numberMast;
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
	Boat other = (Boat) obj;
	if (numberMast != other.numberMast)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Boat numberMast=" + numberMast;
    }

}
