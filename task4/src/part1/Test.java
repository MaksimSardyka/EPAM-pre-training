package part1;

public class Test {
	public static void main(String [] args) {
		long N = 1234567890123456789L;
		
		View.print("Recursive = " + Recursive.calcSumDigits(N) + "\nIterative = " + Iterative.calcSumDigits(N));
	}
}
