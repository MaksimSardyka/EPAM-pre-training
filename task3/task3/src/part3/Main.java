package part3;

public class Main {
	public static void main(String[] args) {
		int testValue1 = 6;
		int testValue2 = 28;
		int testValue3 = 496;
		int testValue4 = 8128;

		View.print(testValue1 + (MyNumber.isPerfect(testValue1) ? " is perfect" : " isn't perfect") + "\n");
		View.print(testValue2 + (MyNumber.isPerfect(testValue2) ? " is perfect" : " isn't perfect") + "\n");
		View.print(testValue3 + (MyNumber.isPerfect(testValue3) ? " is perfect" : " isn't perfect") + "\n");
		View.print(testValue4 + (MyNumber.isPerfect(testValue4) ? " is perfect" : " isn't perfect") + "\n");
	}
}
