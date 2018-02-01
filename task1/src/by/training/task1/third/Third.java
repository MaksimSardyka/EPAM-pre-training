package by.training.task1.third;

import java.util.Scanner;

public class Third {
	private static int a;
	private static int b;
	static void swap(){
		a=a+b-(b=a);
	}
	static void show(int a,int b){
		System.out.println("a="+a+ "; b="+b );
	}
	public static void setA(int i){
		Third.a=i;
	}
	public static void setB(int i){
		Third.b=i;
	}
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
	public static void main(String [] args) {		
		setA(readInput());
		setB(readInput());
		show(a,b);
		swap();
		show(a,b);
	}
}
