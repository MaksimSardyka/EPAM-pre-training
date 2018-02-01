package by.training.task1.part6;

public class Main {
	public static void main(String [] args) {
		int number = MyConsole.readInput(6,"Введите шестизначное целочисленное значение:");
		View.print("Среднеарифметическое цифр числа ="+Number.avgArithm(number));
		View.print("Среднегеометрическое цифр числа ="+Number.avgGeom(number));
	}
}
