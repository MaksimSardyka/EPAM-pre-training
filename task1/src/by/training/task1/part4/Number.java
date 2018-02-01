package by.training.task1.part4;

public class Number {
	static int numDigits(int num) {
		int digits=0;
		while(num>0)
		{
			num/=10;
			digits++;
		}
		return(digits);
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
}
