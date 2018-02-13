package part1;

public class Iterative {
	public static int calcSumDigits(long N){
		int sum = 0;
		while(N>0) {
			sum += N%10;
			N/=10;
		}
		return sum;
	}
}
