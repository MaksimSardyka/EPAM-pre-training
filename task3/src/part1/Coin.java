package part1;

import java.util.Random;

public class Coin {
	public static int play(int numberOfFlips){
		int heads = 0;
		for(int i=0; i<numberOfFlips; i++) {
			if(flipCoin()) {
				heads++;
			}
		}
		return heads;
	}
	
	public static boolean flipCoin(){
		Random random = new Random();
		return random.nextBoolean();
	}
}
