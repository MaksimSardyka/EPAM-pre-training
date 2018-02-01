package by.training.task1.part1;

public class Main {
	public static void main(String [] args) {
		View.print("Введите вес динозавра в граммах:");
		
		int dinoGramm = MyConsole.readNum();
		
		double dinoKg=Dino.toKg(dinoGramm);
		double dinoTon=Dino.toTon(dinoGramm);
		
		View.print("Масса в килограммах:"+dinoKg+"\n");
		View.print("Масса в тоннах:"+dinoTon+"\n");
	}
}
