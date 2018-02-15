package part6;

public class Main {
	public static void main(String[] args) {
		int number = 123456;

		View.print("arithmetical mean = " + Number.calcAvgArithm(number) + "\n");
		View.print("geometric mean = " + Number.calcAvgGeom(number) + "\n");
	}
}
