package part2;

public class Main {
	public static void main(String[] args) {
		double x = 1.2;
		int n = 16;

		View.print("Recursive = " + RecursiveLogic.pow(x, n) + "\nIterative = " + IterativeLogic.pow(x, n));
	}
}
