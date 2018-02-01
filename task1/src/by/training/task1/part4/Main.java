package by.training.task1.part4;

import by.training.task1.part2.View;

public class Main {
	public static void main(String [] args) {
		int number = MyConsole.readInput(4,"Введите четырехзначное целочисленное значение:");
		String result = (Number.checkInc(number) ? 
				"Данная последовательность цифр является возрастающей\n" : 
					(Number.checkDec(number) ? "Данная последовательность цифр является убывающей\n" : 
						"Не явлеется ни возрастающей, ни убывающей\n"));
		View.print(result);
	}
}
