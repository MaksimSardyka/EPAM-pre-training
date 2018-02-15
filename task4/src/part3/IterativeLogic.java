package part3;

public class IterativeLogic {
	private static final int BASE = 10;

	public static long calcSumDigit(long n) {
		int sumDigit = 0;

		while (n > 0) {
			sumDigit += n % BASE;
			n /= BASE;
		}
		return sumDigit;
	}

	public static boolean equals(long n, int s) {
		return calcSumDigit(n) == s;
	}
}
