package part5;

public class Main {
	public static void main(String[] args) {
		int numberRing = 3;
		char firstTowerName = 'A';
		char secondTowerName = 'B';
		char thirdTowerName = 'C';

		View.print("Recursive:\n" + RecursiveLogic.hanoi(numberRing, firstTowerName, secondTowerName, thirdTowerName));
		View.print("Iterative:\n" + IterativeLogic.hanoi(numberRing, firstTowerName, secondTowerName, thirdTowerName));
	}
}
