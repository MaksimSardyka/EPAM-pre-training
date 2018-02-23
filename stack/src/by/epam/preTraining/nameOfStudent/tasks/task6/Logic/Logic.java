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
	private static int BASE = 10;
			
	public static boolean isPalindrome(long number, int length) {

		/*compare digits starting from the middle*/
		for (int i = length / 2; i >= 0; i--) {
			int left = (int) number / (int) Math.pow(BASE, length - i - 1) % BASE;
			int right = (int) number / (int) Math.pow(BASE, i) % BASE;
			if (left != right) {
				return false;
			}
		}
		return true;
	}
}
