/*
 * ByWater
 *
 * @version 1.00
 *
 * @since 27 February 2018
 *
 * @author Maksim Sardyka
 */

package by.epam.task5.moveable;

import by.epam.task6.view.View;

public class Move implements Moveable {
    private boolean move;
    private String moveAction;

    public Move(String moveAction) {
	this.moveAction = moveAction;
    }

    @Override
    public void move(double distance) {
	setMove(true);
	View.print(moveAction);
    }

    @Override
    public boolean isMove() {
	return move;
    }

    @Override
    public void setMove(boolean move) {
	this.move = move;
    }
}
