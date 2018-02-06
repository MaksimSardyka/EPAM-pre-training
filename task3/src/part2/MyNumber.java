package part2;

public class MyNumber {
	public static final int BASE =10;
	
	public static int findMaxDigit(long number){
		int digit=1;
		while(number>0) {
			if(number%BASE>digit) {
				digit=(int)number%BASE;
			}
			number/=BASE;
		}
		return digit;
	}
	
	public static int findLength(long number){
		int length=1;
		while(number/BASE>0) {
			number/=BASE;
			length++;
		}
		return length;
	}
	
	public static boolean checkIsPalindrome(long number){
		int length=findLength(number);
		for(int i = length/2; i>=0; i--) {//compare digits starting from the middle
			int left = (int)number/(int)Math.pow(BASE,length-i-1)%BASE;
			int right = (int)number/(int)Math.pow(BASE,i)%BASE;
			if(left != right) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkIsPrime(long number){
		for(long i = number/2;i>1;i--) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static String findPrimeDivisors(long number){
		StringBuilder divisors = new StringBuilder();
		divisors.append(" "+1);
		for(long i=2;i<=number;i++)
			if(number%i==0) {
				divisors.append(" "+i);
				while(number%i==0) {
					number/=i;
				}
			}
		return divisors.toString();
	}
	
	public static long calculateGCD(long a, long b)
	{
		if (b == 0) return a;
		long mod = a%b;
		return calculateGCD(b, mod);
	}
	
	public static long calculateLCM(long a, long b)
	{
		return a*b/calculateGCD(a,b);
	}
	
	public static int countUniqueDigits(long number)
	{
		int counter=0;
		for(int i=0;i<BASE;i++) {
			long num = number;
			while(num>0) {
				if(num%BASE==i) {
					counter++;
					break;
				}
				num/=BASE;
			}
		}
		return counter;
	}
}
