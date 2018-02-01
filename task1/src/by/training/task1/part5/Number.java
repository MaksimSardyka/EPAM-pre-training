package by.training.task1.part5;

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
