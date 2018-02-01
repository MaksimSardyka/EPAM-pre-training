package by.training.task1.part7;

public class Main{
	public static void main(String [] args) {
		int origin = MyConsole.readInput(7,"Введите семизначное целочисленное значение:");
		int reversed = Number.reverse(origin);
		View.print("Перевернутое число: "+reversed+"\n");
	}
}
