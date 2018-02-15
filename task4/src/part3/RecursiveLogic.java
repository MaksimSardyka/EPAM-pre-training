package part3;

public class RecursiveLogic {
	private static final int BASE = 10;

	public static long calcSumDigit(long n) {
		int sumDigit = 0;
		long result;
		if (n > 0) {
			result = n % BASE + calcSumDigit(n / BASE);
		} else {
			result = sumDigit;
		}
		return result;
	}

	public static boolean equals(long n, int s) {
		return calcSumDigit(n) == s;
	}
}