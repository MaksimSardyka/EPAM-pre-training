package by.training.task1.first;

import java.util.Scanner;

public class First {
	private static int dinoGramm;
	public static double dinoToKg(){
		return ((double)dinoGramm/1000);
	}
	public static double dinoToTon(){
		return ((double)dinoGramm/1_000_000);
	}
	public static void readInput() {

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
			dinoGramm = inp;
	}
	
	public static void main(String [] args) {
		readInput();
		System.out.println("Масса в килограммах:"+dinoToKg());
		System.out.print("Масса в тоннах:"+dinoToTon());
	}
}
