package by.training.task1.second;

import java.util.Scanner;

public class Second {
private static int r1,r2;

public static int readInput() {

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
public static double RingSqr(int outer, int inner){
	return(Math.PI*(outer^2 - inner^2));
}
public static void main() {
		System.out.println("¬ведите радиус первого круга:");
		Second.r1=readInput();
		while(Second.r2>Second.r1) {
			System.out.println("¬ведите радиус второго круга:");
			Second.r2 = readInput();
		}
		System.out.println("ѕлощадь кольца = "+RingSqr(Second.r1,Second.r2));
	}
}
