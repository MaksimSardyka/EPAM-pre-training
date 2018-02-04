package part1;

public class Main {
	public static void main(String [] args) {
		int age = 745;
		
		int numHeads = Head.countHeads(age);
		int numEyes = Head.countEyes(numHeads);
		
		View.print("Number of heads: "+numHeads+".\nNumber of eyes: "+numEyes+".\n");
	}
}
