package by.training.task1.part1;

public class Main {
	public static void main(String [] args) {
		View.print("������� ��� ��������� � �������:");
		
		int dinoGramm = MyConsole.readNum();
		
		double dinoKg=Dino.toKg(dinoGramm);
		double dinoTon=Dino.toTon(dinoGramm);
		
		View.print("����� � �����������:"+dinoKg+"\n");
		View.print("����� � ������:"+dinoTon+"\n");
	}
}
