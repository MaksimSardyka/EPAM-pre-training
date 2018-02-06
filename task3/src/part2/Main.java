package part2;

public class Main {
	public static void main(String [] args) {
		long A = 12421L;
		long B = 8L;
		
		View.print("Greatest digit of "+ A + " is: "+MyNumber.findMaxDigit(A)+"\n");
		View.print("Number "+A+(MyNumber.checkIsPalindrome(A)?" is":" isn't")+" a palindrome\n");
		View.print("Number "+A+(MyNumber.checkIsPrime(A)?" is":" isn't")+" a prime\n");
		View.print("Prime divisors of "+A+":"+MyNumber.findPrimeDivisors(A)+"\n");
		View.print("GCD of "+A+" and "+B+" is: "+MyNumber.calculateGCD(A,B)+", LCM is: "+MyNumber.calculateLCM(A,B)+"\n");
		View.print("Number of unique digits in "+A+" is: "+MyNumber.countUniqueDigits(A)+"\n");
	}
}
