package part4;

public class Number {
	public static int [] toArray(int num) {
		int digit1 = num/1000;
		int digit2 = num/100 % 10;
		int digit3 = num/10 % 10;
		int digit4 = num % 10;
		int arr[] = {digit1,digit2,digit3,digit4};
		return arr;
	}
	public static boolean checkInc(int num){
		int [] digits = toArray(num);
		return digits[0]<digits[1] ? (digits[1]<digits[2]? (digits[2]<digits[3]?true:false) :false) : false;
	}
	public static boolean checkDec(int num){
		int [] digits = toArray(num);
		return digits[3]<digits[2] ? (digits[2]<digits[1]? (digits[1]<digits[0]?true:false) :false) : false;
	}
}
