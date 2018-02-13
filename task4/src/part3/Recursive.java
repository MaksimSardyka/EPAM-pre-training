package part3;

public class Recursive {
	private static long calcSumDigits(long N){
		int sum = 0;
		if(N>0) {
			return N%10 + calcSumDigits(N/10);
		} else {
			return sum;
		}
	}
	
	public static boolean equals(long N,long S) {
		return calcSumDigits(N)==calcSumDigits(S);
	}
}
