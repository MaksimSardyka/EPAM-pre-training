/*
 * Test
 *
 * @version 1.00
 *
 * @since 23 февр. 2018 г.
 *
 * @author Maskim Sardyka
 */

package by.epam.preTraining.nameOfStudent.tasks.task6.Test;

import by.epam.preTraining.nameOfStudent.tasks.task6.Stack.MasStack;
import by.epam.preTraining.nameOfStudent.tasks.task6.View.View;
import by.epam.preTraining.nameOfStudent.tasks.task6.Logic.Logic;

public class Test {
	/**
	 * Class description goes here.
	 *
	 * @version 1.00 23 февр. 2018 г.
	 * @author Maksim Sardyka
	 */
	public static void main(String[] args) {
		MasStack stack = new MasStack(9);
		int number = 1234554321;

		while (number > 0) {
			stack.push((int) (number % 10));
			number /= 10;
		}

		long myNumber = 0;
		int length = stack.size();
		while (!stack.isEmpty()) {
			myNumber = myNumber * 10 + (int) stack.pop();
		}
		View.print(myNumber + (Logic.isPalindrome(myNumber, length) ? "is a Palindrome" : " Isn't a palindrome"));
	}
}
