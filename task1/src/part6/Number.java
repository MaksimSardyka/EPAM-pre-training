package part6;

public class Number {
	public static double calculateAvgArithm(int num) {
		return(Number.sumDigits(num)/6.0);
	}
	public static double calculateAvgGeom(int num) {
		return(Math.pow(Number.mulDigits(num), 1.0/6.0));
	}
	public static int [] toArray(int num) {
		int digit1 = num/100000;
		int digit2 = num/10000 %10;
		int digit3 = num/1000 %10;
		int digit4 = num/100 %10;
		int digit5 = num/10 %10;
		int digit6 = num %10;
		int arr[] = {digit1,digit2,digit3,digit4,digit5,digit6};
		return arr;
	}
	static int sumDigits(int num){
		int [] digits=toArray(num);
		return(digits[0]+digits[1]+digits[2]+digits[3]+digits[4]+digits[5]);
	}
	static int mulDigits(int num){
		int [] digits=toArray(num);
		return(digits[0]*digits[1]*digits[2]*digits[3]*digits[4]+digits[5]);
	}
}
