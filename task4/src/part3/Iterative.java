package part3;

public class Iterative {
	private static int calcSumDigits(long N){
		int sum = 0;
		while(N>0) {
			sum += N%10;
			N/=10;
		}
		return sum;
	}
	
	public static boolean equals(long N,long S) {
		return calcSumDigits(N)==calcSumDigits(S);
	}
}
