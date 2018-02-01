package by.training.task2.part5;

public class Main {
	public static void main(String [] args) {
	View.print("*** Название числа в виде строки ***\nВведите число: ");
	int num1 = MyConsole.read();
	String rusText = MyNum.toRus(num1);
	View.print("Число в виде строки: "+rusText+"\n");
	
	View.print("*** The name of the number as a string ***\nInput number: ");
	int num2 = MyConsole.read();
	String engText = MyNum.toEng(num2);
	View.print("The number as a string: "+engText+"\n");
	}
}
