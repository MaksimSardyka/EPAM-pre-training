/*
 * Logic
 *
 * @version 1.00
 *
 * @since 23 февр. 2018 г.
 *
 * @author Maskim Sardyka
 */

package by.epam.preTraining.nameOfStudent.tasks.task6.Logic;

import by.epam.preTraining.nameOfStudent.tasks.task6.Stack.MasStack;

public class Logic {
	private static int BASE = 10;

	/**
	 * Logic implementation
	 *
	 * @version 1.00 23 февр. 2018 г.
	 * @author Maksim Sardyka
	 */
	public static boolean isPalindrome(long number, int length) {

		for (int i = length / 2; i >= 0; i--) {// compare digits starting from the middle
			int left = (int) number / (int) Math.pow(BASE, length - i - 1) % BASE;
			int right = (int) number / (int) Math.pow(BASE, i) % BASE;
			if (left != right) {
				return false;
			}
		}
		return true;
	}
}
