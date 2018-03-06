/*
 * Moveable
 *
 * @version 1.00
 *
 * @since 18 February
 *
 * @author Maksim Sardyka
 */

package by.epam.task5.moveable;

public interface Moveable {
    public void move(double distance);

    boolean isMove();

    void setMove(boolean move);
}
