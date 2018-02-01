package by.training.task2.part1;

public class Main {
	public static void main(String [] args) {
		int headsBorn = 3;//number of heads dragon born with
		int age = 745;
		int eyesPerHead = 3;
		int numHeadsNow = Head.counter(headsBorn, age);
		int numEyes = eyesPerHead * numHeadsNow;
		View.print("Количество голов: "+numHeadsNow+".\nКоличество глаз: "+numEyes+".\n");
	}
}
