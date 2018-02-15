package part3;

public class Main {
	public static void main(String[] args) {
		long n = 1_234_567L;
		int s = 28;

		View.print("Iterative: " + IterativeLogic.equals(n, s) + "\nRecursive: " + RecursiveLogic.equals(n, s));
	}
}
