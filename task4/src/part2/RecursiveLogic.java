package part2;

public class RecursiveLogic {
	public static double pow(double x, int n) {
		return (n != 1 ? x * pow(x, n - 1) : x);
	}
}
