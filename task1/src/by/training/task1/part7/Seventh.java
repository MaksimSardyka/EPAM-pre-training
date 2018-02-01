package by.training.task1.part7;

import java.util.Scanner;

public class Seventh {
	
	public static int readInput(int length,String prom) {

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		System.out.println(prom);

		int inp = 0;
			while(inp==0) {
			while (!sc.hasNextInt()) {
	
				String trash = sc.next();
	
				System.out.println(trash + " Incorrect. Try again.");
	
			}
			int line = sc.nextInt();
			if(numOfDigits(line)==length) {
				inp = line;
			}else {
				System.out.println("Введите число из "+ length +" цифр");
			}
		}
		return inp;
	}
	static int numOfDigits(int num) {
		int digits=0;
		while(num>0)
		{
			num/=10;
			digits++;
		}
		return(digits);
	}
	public static int reverse(int num) {
		int reversed=0;
		while(num>0)
		{
			reversed=reversed*10+num%10;
			num/=10;
		}
		return(reversed);
	}
	public static void main(String [] args) {
		int origin = readInput(7,"Введите семизначное целочисленное значение:");
		System.out.println(reverse(origin));
	}
}
