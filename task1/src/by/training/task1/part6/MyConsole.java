package by.training.task1.part6;

import java.util.Scanner;

public class MyConsole {
	public static int readInput(int length,String prom) {

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		View.print(prom);

		int inp = 0;
			while(inp==0) {
			while (!sc.hasNextInt()) {
	
				String trash = sc.next();
	
				View.print(trash + " Incorrect. Try again.");
	
			}
			int line = sc.nextInt();
			if(Number.numDigits(line)==length) {
				inp = line;
			}else {
				View.print("Введите число из "+ length +" цифр");
			}
		}
		return inp;
	}
}
