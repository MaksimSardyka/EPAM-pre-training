/*
 * InParking
 *
 * @version 1.00
 *
 * @since 27 February 2017
 *
 * @author Maksim Sardyka 
 */

package by.epam.task5.parkable;

import by.epam.task5.view.View;

public class InParking implements Parkable {
    
    @Override
    public void park() {
	View.print("Placed in parking\n");
    }

    @Override
    public void unpark() {
	View.print("Removed from parking\n");
    }
}
