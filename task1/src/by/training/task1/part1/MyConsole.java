package by.training.task1.part1;

import java.util.Scanner;

public class MyConsole {
	public static int readNum() {

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int inp = 0;
			while(inp==0) {
			while (!sc.hasNextInt()) {

				String trash = sc.next();

				System.out.println(trash + " Incorrect. Try again.");

			}
			inp = sc.nextInt();
		}
			return inp;
	}
}
