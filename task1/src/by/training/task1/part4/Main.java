package by.training.task1.part4;

import java.util.Scanner;

public class Main {
	static int numOfDigits(int num) {
		int digits=0;
		while(num>0)
		{
			num/=10;
			digits++;
		}
		return(digits);
	}
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
	public static boolean checkInc(int num){
		int digit = num%10;//последняя цифра
		num/=10;
		
		while(num>0) {
			if(digit>num%10) {
				digit=num%10;
				num/=10;
			} else {
				return(false);
			}
		}
		return(true);
	}
	public static boolean checkDec(int num){
		int digit = num%10;//последняя цифра
		num/=10;
		
		while(num>0) {
			if(digit<num%10) {
				digit=num%10;
				num/=10;
			} else {
				return(false);
			}
		}
		return(true);
	}
	
	public static void main(String [] args) {
		int number = readInput(4,"Введите четырехзначное целочисленное значение:");
		if(checkInc(number)) {
			System.out.println("Данная последовательность цифр является возрастающей");	
		} else if(checkDec(number)) {
			System.out.println("Данная последовательность цифр является убвыающей");	
		}
	}
}
