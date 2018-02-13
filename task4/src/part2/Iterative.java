package part2;

public class Iterative {
	public static double pow(double x, int n) {
		double result = x;
		while(n>1) {
			result*=x;
			n--;
		}
		return result;
	}
}
