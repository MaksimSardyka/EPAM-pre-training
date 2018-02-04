package part6;

public class Main {
	public static void main(String [] args) {
		int number = 123456;
		View.print("arithmetical mean = "+Number.calculateAvgArithm(number)+"\n");
		View.print("geometric mean = "+Number.calculateAvgGeom(number)+"\n");
	}
}
