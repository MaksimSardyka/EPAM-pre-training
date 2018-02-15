package part3;

public class MyNumber {
	public static boolean isPerfect(int number) {
		int sumDivisor = 1;
		for (int i = number / 2; i > 1; i--) {
			if (number % i == 0) {
				sumDivisor += i;
			}
		}
		return sumDivisor == number;
	}
}
