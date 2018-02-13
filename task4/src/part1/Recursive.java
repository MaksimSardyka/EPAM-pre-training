package part1;

public class Recursive {
	public static long calcSumDigits(long N){
		int sum = 0;
		if(N>0) {
			return N%10 + calcSumDigits(N/10);
		} else {
			return sum;
		}
	}
}
