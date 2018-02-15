package part2;

public class Main {
	public static void main(String[] args) {
		long a = 12421L;
		long b = 8L;

		View.print("Greatest digit of " + a + " is: " + MyNumber.findMaxDigit(a) + "\n");
		View.print("Number " + a + (MyNumber.isPalindrome(a) ? " is" : " isn't") + " a palindrome\n");
		View.print("Number " + a + (MyNumber.isPrime(a) ? " is" : " isn't") + " a prime\n");
		View.print("Prime divisors of " + a + ":" + MyNumber.findPrimeDivisors(a) + "\n");
		View.print("GCD of " + a + " and " + b + " is: " + MyNumber.calculateGCD(a, b) + ", LCM is: "
				+ MyNumber.calculateLCM(a, b) + "\n");
		View.print("Number of unique digits in " + a + " is: " + MyNumber.countUniqueDigits(a) + "\n");
	}
}
