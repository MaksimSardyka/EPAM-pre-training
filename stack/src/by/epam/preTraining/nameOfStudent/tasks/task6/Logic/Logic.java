/*
 * Logic
 *
 * @version 1.00
 *
 * @since 23 февр. 2018 г.
 *
 * @author Maskim Sardyka
 */

package by.epam.preTraining.nameOfStudent.tasks.task6.logic;

public class Logic {
	/**
	 * checks is palindrome
	 *
	 * @version 1.00 23 Feb 2018
	 * @author Maksim Sardyka
	 */		
	public static boolean isPalindrome(int [] number) {

		/*compare digits starting from the middle*/
		for (int i = (number.length-1) / 2; i >= 0; i--) {
			if (number[i] != number[number.length-i-1]) {
				return false;
			}
		}
		return true;
	}
}
