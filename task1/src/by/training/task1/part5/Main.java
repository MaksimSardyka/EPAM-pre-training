package by.training.task1.part5;

public class Main {	

	public static void main(String [] args) {
		int number=MyConsole.readInput(5,"Введите пятизначное целочисленное значение:");
		int sumDigits = Number.sumDigits(number);
		int mulDigits = Number.mulDigits(number);
		View.print("Сумма цифр числа = "+sumDigits);
		View.print("Произведение цифр числа = "+mulDigits);
	}
}
