package by.training.task1.part6;

import java.util.Scanner;

public class Sixth {
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
	static int sumDigits(int num){
		int sum=num%10;
		num/=10;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		return(sum);
	}
	static int mulDigits(int num){
		int mul=num%10;
		num/=10;
		while(num>0)
		{
			mul*=num%10;
			num/=10;
		}
		return(mul);
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
	public static double avgArithm(int num) {
		return((double)sumDigits(num)/numOfDigits(num));
	}
	public static double avgGeom(int num) {
		return(Math.pow(mulDigits(num), 1.0/numOfDigits(num)));
	}
	
	public static void main(String [] args) {
		int number = readInput(6,"Введите шестизначчное целочисленное значение:");
		System.out.println("Среднеарифметическое цифр числа ="+avgArithm(number));
		System.out.println("Среднегеометрическое цифр числа ="+avgGeom(number));
	}
}
