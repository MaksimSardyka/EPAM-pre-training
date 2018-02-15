package part1;

public class IterativeLogic {
	private static final int BASE = 10;

	public static int calcSumDigit(long n) {
		int sumDigit = 0;
		
		while (n > 0) {
			sumDigit += n % BASE;
			n /= BASE;
		}
		return sumDigit;
	}
}
