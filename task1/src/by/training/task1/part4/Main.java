package by.training.task1.part4;

import by.training.task1.part2.View;

public class Main {
	public static void main(String [] args) {
		int number = MyConsole.readInput(4,"������� �������������� ������������� ��������:");
		String result = (Number.checkInc(number) ? 
				"������ ������������������ ���� �������� ������������\n" : 
					(Number.checkDec(number) ? "������ ������������������ ���� �������� ���������\n" : 
						"�� �������� �� ������������, �� ���������\n"));
		View.print(result);
	}
}
