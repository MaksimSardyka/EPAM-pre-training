package part3;

import java.util.Random;

public class MyArr {
	public static String getOneRandom(String[] arr) {
		Random random = new Random();
		return arr[random.nextInt(arr.length)];
	}
}
