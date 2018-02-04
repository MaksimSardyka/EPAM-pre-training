package part7;

public class Number {
	public static int reverse(int num) {
		int reversed = (num%10)*1_000_000+(num/10%10)*100_000+(num/100%10)*10_000+(num/1_000%10)*1_000+(num/10_000%10)*100+(num/100_000%10)*10+(num/1000_000%10);
		return(reversed);
	}
}
