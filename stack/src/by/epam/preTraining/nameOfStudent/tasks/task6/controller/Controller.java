/*
 * Test
 *
 * @version 1.00
 *
 * @since 23 Feb 2018
 *
 * @author Maskim Sardyka
 */

package by.epam.preTraining.nameOfStudent.tasks.task6.controller;

import by.epam.preTraining.nameOfStudent.tasks.task6.logic.Logic;
import by.epam.preTraining.nameOfStudent.tasks.task6.stack.MasStack;
import by.epam.preTraining.nameOfStudent.tasks.task6.view.View;

public class Controller {
	/**
	 * Controller
	 *
	 * @version 1.00 23 Feb 2018
	 * @author Maksim Sardyka
	 */
	public static void main(String[] args) {
		MasStack<Integer> stack = new MasStack<>();
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

		View.print(myNumber + (Logic.isPalindrome(myNumber, length) ? " is a palindrome" : " isn't a palindrome"));
	}
}
