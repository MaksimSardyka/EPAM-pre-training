package part4;

import part2.View;

public class Main {
	public static void main(String [] args) {
		int number = 9863;
		
		View.print(Number.checkInc(number) ? "This sequence of numbers is increasing\n" : 
			(Number.checkDec(number) ? "This sequence of digits is decreasing\n" : "Is neither increasing nor decreasing\n"));
	}
}
