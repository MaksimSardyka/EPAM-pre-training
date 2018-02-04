package part5;

public class Main {
	public static void main(String [] args) {
	int num1=345;
	int num2=716;
	
	View.print("*** Название числа в виде строки ***\nВведите число: "+num1+"\n");
	String rusText = MyNum.convertToRus(num1);
	View.print("Число в виде строки: "+rusText+"\n");
	
	View.print("*** The name of the number as a string ***\nInput number: "+num2+"\n");
	String engText = MyNum.convertToEng(num2);
	View.print("The number as a string: "+engText+"\n");
	}
}
