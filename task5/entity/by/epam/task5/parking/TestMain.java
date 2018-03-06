/*
 * TestMain.java
 *
 * @version 1.00
 *
 * @since 27 February 2018
 *
 * @author Maskim Sardyka
 */
package by.epam.task5.parking;

import java.util.Random;

import by.epam.task5.builder.VehicleBuilder;
import by.epam.task5.vehicles.Boat;
import by.epam.task5.vehicles.Car;
import by.epam.task5.vehicles.MotorBoat;
import by.epam.task5.vehicles.Vehicle;
import by.epam.task5.view.View;

public class TestMain {
    static final int VEHICLES_NUMBER = 100;
    static final int GASOLINE_COST_PER_GALON = 2;
    static final int TEST_DAY_PERIOD = 30;

    static final int CAR_PER_DAY_PRICE = 10;
    static final int BOAT_PER_DAY_PRICE = 20;
    static final int MOTORBOAT_PER_DAY_PRICE = 30;

    static final double PRICE_FUEL = 0.63;

    public static void main(String[] args) {
	Random rand = new Random();

	/* Create test array with random elements */
	Parking clients = new Parking();
	for (int i = VEHICLES_NUMBER - 1; i >= 0; i--) {
	    switch (rand.nextInt(3)) {
	    case 0:
		clients.addNewVehicle((Boat)new VehicleBuilder().perDayCost(rand.nextInt(BOAT_PER_DAY_PRICE)).buildVehicle());
		break;
	    case 1:
		/* Create vehicle with random fuel tank volume */
		clients.addNewVehicle(new MotorBoat());
		MotorBoat mboat = (MotorBoat) clients.findVehicleByIndex(clients.getAmoungtVehicle() - 1);
		mboat.getFuelBehavior().setTankMaxVolume(rand.nextInt(200));
		clients.findVehicleByIndex(clients.getAmoungtVehicle() - 1).setPerDayCost(MOTORBOAT_PER_DAY_PRICE);
		break;
	    case 2:
		clients.addNewVehicle(new Car());
		Car car = (Car) clients.findVehicleByIndex(clients.getAmoungtVehicle() - 1);
		car.getFuelBehavior().setTankMaxVolume(rand.nextInt(200));
		clients.findVehicleByIndex(clients.getAmoungtVehicle() - 1).setPerDayCost(CAR_PER_DAY_PRICE);
	    }
	}

	/* Emulates usage of gasoline */
	for (int i = VEHICLES_NUMBER - 1; i >= 0; i--) {
	    if (clients.findVehicleByIndex(i) instanceof Car) {
		Car car = (Car) clients.findVehicleByIndex(i);
		double fuel = car.getFuelBehavior().getTankMaxVolume() - car.getFuelBehavior().getFuelVolume();
		clients.fuelSold(fuel);
		clients.addMoney(fuel *  PRICE_FUEL);
		car.getFuelBehavior()
			.addFuel(car.getFuelBehavior().getTankMaxVolume() - car.getFuelBehavior().getFuelVolume());
	    } else if (clients.findVehicleByIndex(i) instanceof MotorBoat) {
		MotorBoat mboat = (MotorBoat) clients.findVehicleByIndex(i);
		double fuel = mboat.getFuelBehavior().getTankMaxVolume() - mboat.getFuelBehavior().getFuelVolume();
		clients.fuelSold(fuel);
		clients.addMoney(fuel * PRICE_FUEL);
		mboat.getFuelBehavior()
			.addFuel(mboat.getFuelBehavior().getTankMaxVolume() - mboat.getFuelBehavior().getFuelVolume());
	    }
	}

	/* Sum up my day profit for parking */
	for (int i = clients.getAmoungtVehicle() - 1; i > 0; i--) {
	    View.print(clients.findVehicleByIndex(i) + "\n");
	    clients.addMoney(clients.findVehicleByIndex(i).getPerDayCost());
	}

	View.print("Amount of fuel sold is: " + clients.getFuelWasted() + "; Our profit is: " + clients.getMoneyEarned() + "$");
    }
}
