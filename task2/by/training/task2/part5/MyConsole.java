package by.training.task2.part5;

import java.util.Scanner;
public class MyConsole {
	public static int read() {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		int inp = 0;
			while(inp==0) {
				while (!sc.hasNextInt()) {
					String trash = sc.next();
					System.out.println(trash + "Wrong input. Try again:");
				}
				inp = sc.nextInt();
			}
			return inp;
	}
}
