package by.training.task1.part6;

public class Number {
	public static double avgArithm(int num) {
		return((double)Number.sumDigits(num)/Number.numDigits(num));
	}
	public static double avgGeom(int num) {
		return(Math.pow(Number.mulDigits(num), 1.0/Number.numDigits(num)));
	}
	static int numDigits(int num) {
		int digits=0;
		while(num>0)
		{
			num/=10;
			digits++;
		}
		return(digits);
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
}
