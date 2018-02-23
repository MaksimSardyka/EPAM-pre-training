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
		long number = 123454321;

		while (number > 0) {
			stack.push((int) (number % 10));
			number /= 10;
		}

		int myNumber[] = new int[stack.size()];

		for (int i = myNumber.length-1; i >= 0; i--) {
			myNumber[i] = (int) stack.pop();
		}
		View.print(Logic.isPalindrome(myNumber) ? "is a palindrome" : "isn't a palindrome");
	}
}
