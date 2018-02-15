package part1;

public class Test {
	public static void main(String[] args) {
		long n = 1234567890123456789L;

		View.print("Recursive = " + RecursiveLogic.calcSumDigit(n) + "\nIterative = " + IterativeLogic.calcSumDigit(n));
	}
}
