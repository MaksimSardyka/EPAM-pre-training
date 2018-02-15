package part3;

public class RecursiveLogic {
	private static final int BASE = 10;

	private static long calcSumDigit(long n) {
		int sumDigit = 0;

		return n > 0 ? n % BASE + calcSumDigit(n / BASE) : sumDigit;
	}

	public static boolean equals(long n, int s) {
		return calcSumDigit(n) == s;
	}
}