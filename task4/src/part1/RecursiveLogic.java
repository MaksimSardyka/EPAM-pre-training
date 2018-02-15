package part1;

public class RecursiveLogic {
	private static final int BASE = 10;

	public static long calcSumDigit(long n) {
		int sumDigit = 0;

		return (n > 0 ? (n % BASE + calcSumDigit(n / BASE)) : sumDigit);
	}
}
