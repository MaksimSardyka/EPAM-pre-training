package by.training.task1.part7;

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
	public static int reverse(int num) {
		int reversed=0;
		while(num>0)
		{
			reversed=reversed*10+num%10;
			num/=10;
		}
		return(reversed);
	}
}
