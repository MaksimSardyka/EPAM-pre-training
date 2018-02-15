package part2;

public class Main {
	public static void main(String[] args) {
		int r1 = 1;
		int r2 = 8;

		double area = Ring.calcArea(r1, r2);

		View.print("Ring area = " + area);
	}
}
