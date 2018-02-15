package part1;

import java.util.Random;

public class Coin {
	public static int tossCoin(int numberFlip) {
		int heads = 0;
		for (int i = 0; i < numberFlip; i++) {
			if (isHead()) {
				heads++;
			}
		}
		return heads;
	}

	public static boolean isHead() {
		Random random = new Random();
		return random.nextBoolean();
	}
}
