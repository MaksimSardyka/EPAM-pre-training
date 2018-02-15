package part1;

public class Main {
	public static void main(String[] args) {
		int dinoGram = 12_345_678;
		View.print("Input weight of dinosaur in grams:" + dinoGram + "\n");

		double dinoKg = Weight.convertToKg(dinoGram);
		double dinoTon = Weight.convertToTon(dinoGram);

		View.print("Weight in kg:" + dinoKg + "\n");
		View.print("Weight in ton:" + dinoTon + "\n");
	}
}
