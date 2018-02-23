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
		MasStack stack = new MasStack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		long myNumber = 1;
		int length = stack.size();
		while(!stack.isEmpty()) {
			myNumber = myNumber*10 + (int)stack.pop();
		}
		 View.print(Logic.isPalindrome(myNumber,length)?"Palindrome":"Isn't palindrome");
	}
}
