package part1;

public class HeadsOrTails {
	public static void main(String[] args) {
		int numberOfFlips = 1000;

		int heads = Coin.tossCoin(numberOfFlips);
		int tails = numberOfFlips - heads;

		View.print("Heads =" + heads + "\nTails =" + tails);
	}
}
