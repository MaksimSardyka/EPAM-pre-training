package part5;

public class Main {	

	public static void main(String [] args) {
		int number=12345;
		
		int sumDigits = Number.sumDigits(number);
		int mulDigits = Number.mulDigits(number);
		
		View.print("Sum of digits = "+sumDigits+"\n");
		View.print("Multiplication of digits= "+mulDigits+"\n");
	}
}
