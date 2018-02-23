/*
 * 
 *
 * @version 1.00
 *
 * @since 23 февр. 2018 г.
 *
 * @author Maskim Sardyka
 */


package by.epam.preTraining.nameOfStudent.tasks.task6.Stack;

import by.epam.preTraining.nameOfStudent.tasks.task6.View.View;

public class StackOutOfBoundsException extends Exception {

	private static final long serialVersionUID = 1L;
	public void showError(){
		View.print("This element didnt exists\n");
		this.printStackTrace();
	}
	/**
	 * Class description goes here.
	 *
	 * @version 1.00 23 февр. 2018 г.
	 * @author Maksim Sardyka
	 */
}
