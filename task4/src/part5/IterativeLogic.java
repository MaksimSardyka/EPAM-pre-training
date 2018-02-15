package part5;

public class IterativeLogic {
	private static final String TOWER_SEPARATOR = "-->";
	private static final String NEXT_LINE_SYMBOL = "\n";

	public static String hanoi(int numberRing, char sourceTower, char targetTower, char temporaryTower) {
		char[] towers = { sourceTower, targetTower, temporaryTower };
		StringBuilder str = new StringBuilder();
		int limit = (int) Math.pow(2, numberRing) - 1; // number of all iterations

		for (int i = 0; i < limit; i++) {
			int currentDisk = findDisk(i); // disk that I move on this iteration
			int source = (calcMovements(i, currentDisk) * findDirection(currentDisk, numberRing)) % towers.length; // find
																													// source
																													// tower
			int target = (source + findDirection(currentDisk, numberRing)) % towers.length; // find target tower
			str.append(towers[source]).append(TOWER_SEPARATOR).append(towers[target]).append(NEXT_LINE_SYMBOL);
		}

		return str.toString();
	}

	private static int findDisk(int i) { // which disk I will move
		int counter;
		int x = i + 1;

		for (counter = 0; x % 2 == 0; counter++) {
			x /= 2;
		}
		return counter;
	}

	private static int calcMovements(int i, int currentDisk) { // how many times this disk has been moved
		while (currentDisk-- != 0) {
			i /= 2;
		}
		return (i + 1) / 2;
	}

	private static int findDirection(int currentDisk, int numberRing) { // direction for this disk: clockwise=1,
																		// anticlockwise=2
		return 2 - (numberRing + currentDisk) % 2;
	}
}