package part2;

public class Main {
	public static void main(String[] args) {
		double x = 1.2;
		int n = 16; 
		
		View.print("Recursive = " + Recursive.pow(x, n) +"\nIterative = "+ Iterative.pow(x, n));
	}
}
