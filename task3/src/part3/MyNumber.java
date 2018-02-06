package part3;

public class MyNumber {
	public static boolean checkIsPerfect(int  number) {
		int sum = 1;
		for(int i = number/2; i>1; i--) {
			if(number%i==0) {
				sum+=i;
			}
		}
		return sum==number;
	}
}
