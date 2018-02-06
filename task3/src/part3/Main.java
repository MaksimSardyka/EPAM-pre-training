package part3;

public class Main {
	public static void main(String []args) {
		int testValue1 = 6;
		int testValue2 = 28;
		int testValue3 = 496;
		int testValue4 = 8128;
		
		View.print(testValue1 + (MyNumber.checkIsPerfect(testValue1)?" is perfect":" isn't perfect") +"\n");
		View.print(testValue2 + (MyNumber.checkIsPerfect(testValue2)?" is perfect":" isn't perfect") +"\n");
		View.print(testValue3 + (MyNumber.checkIsPerfect(testValue3)?" is perfect":" isn't perfect") +"\n");
		View.print(testValue4 + (MyNumber.checkIsPerfect(testValue4)?" is perfect":" isn't perfect") +"\n");
	}
}
