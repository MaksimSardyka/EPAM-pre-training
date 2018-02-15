package part1;

public class RecursiveLogic {
	private static final int BASE = 10;

	public static long calcSumDigit(long n) {
		int sumDigit = 0;
		
		if (n > 0) {
			return n % BASE + calcSumDigit(n / BASE);
		} else {
			return sumDigit;
		}
	}
}
