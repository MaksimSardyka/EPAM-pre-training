package by.training.task1.part7;

public class Main{
	public static void main(String [] args) {
		int origin = MyConsole.readInput(7,"������� ����������� ������������� ��������:");
		int reversed = Number.reverse(origin);
		View.print("������������ �����: "+reversed+"\n");
	}
}
