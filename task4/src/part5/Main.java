package part5;

public class Main {
	public static void main(String[] args) {
		int numberOfRings=3;
		
		View.print("Recursive:\n"+Recursive.hanoi(numberOfRings, 'A', 'B', 'C'));
		View.print("Iterative:\n"+Iterative.hanoi(numberOfRings, 'A', 'B', 'C'));
	}
}
