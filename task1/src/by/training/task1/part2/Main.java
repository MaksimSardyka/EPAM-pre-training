package by.training.task1.part2;

public class Main {
	public static void main(String [] args) {
			int r1=5;
			int r2=1;
			double square = Ring.getSquare(r1,r2);
			View.print( square>0 ? "Площадь кольца = " + square +"\n" : "Неверные данные\n" );
	}
}
