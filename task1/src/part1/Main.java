package part1;

public class Main {
	public static void main(String [] args) {
		int dinoGram = 123_456;
		View.print("Input weight of dinosaur in grams:"+ dinoGram +"\n");
		
		double dinoKg=Weight.convertToKgs(dinoGram);
		double dinoTon=Weight.convertToTons(dinoGram);
		
		View.print("Weight in kg:"+dinoKg+"\n");
		View.print("Weight in ton:"+dinoTon+"\n");
	}
}
