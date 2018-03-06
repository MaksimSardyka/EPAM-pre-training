/*
 * Logic.java
 *
 * @version 1.00
 *
 * @since 04 March 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.task7.tree;

import java.util.Random;

import by.epam.task5.builder.VehicleBuilder;
import by.epam.task5.vehicles.Vehicle;
import by.epam.task7.view.View;

public class Logic {
    /**
     * Test logic implementation
     *
     * @version 1.00
     * 
     * @since 4 March 2018
     * @author Maksim Sardyka
     */

    public static void main(String[] args) {
	Random rand = new Random();

	BinaryTree<Vehicle> binaryTree = new BinaryTree<>();

	/* Create test array with random elements */
	for (int i = 100 - 1; i >= 0; i--) {
	    binaryTree.add(new VehicleBuilder().perDayCost(rand.nextInt(100)).buildVehicle());
	}

	/* Sorted by perDayCost field value */
	View.print("In order: \n");
	binaryTree.inOrder(binaryTree.getRoot());
	View.print("\nPre order: \n");
	binaryTree.preOrder(binaryTree.getRoot());
	View.print("\nPost order: \n");
	binaryTree.postOrder(binaryTree.getRoot());
    }
}
