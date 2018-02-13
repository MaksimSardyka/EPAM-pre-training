package part5;

public class Recursive {
	public static StringBuilder str = new StringBuilder();
	
	public static String hanoi(int numberOfRings, char sourceTower, char targetTower, char temporaryTower ) {
		if(numberOfRings>0) {
		        hanoi(numberOfRings-1, sourceTower, temporaryTower, targetTower);
		        str.append(sourceTower+"->"+targetTower+"\n");
		        hanoi(numberOfRings-1, temporaryTower, targetTower, sourceTower);
		}
		return str.toString();
	}
}