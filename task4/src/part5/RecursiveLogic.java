package part5;

public class RecursiveLogic {
	private static final String TOWER_SEPARATOR = "-->";
	private static final String NEXT_LINE_SYMBOL = "\n";
	public static StringBuilder str = new StringBuilder();

	public static String hanoi(int numberRing, char sourceTower, char targetTower, char temporaryTower) {
		if (numberRing > 0) {
			hanoi(numberRing - 1, sourceTower, temporaryTower, targetTower);
			str.append(sourceTower).append(TOWER_SEPARATOR).append(targetTower).append(NEXT_LINE_SYMBOL);
			hanoi(numberRing - 1, temporaryTower, targetTower, sourceTower);
		}
		return str.toString();
	}
}