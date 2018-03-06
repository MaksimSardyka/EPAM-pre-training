/*
 * InDock
 *
 * @version 1.00
 *
 * @since 27 February 2018
 *
 * @author Maksim Sardyka 
 */

package by.epam.task5.parkable;
import by.epam.task7.view.View;

public class InDock implements Parkable {
    @Override
    public void park() {
	View.print("Send in docks\n");
    }
    public void unpark() {
	View.print("Removed from docks\n");
    }
}
