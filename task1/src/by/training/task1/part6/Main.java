package by.training.task1.part6;

public class Main {
	public static void main(String [] args) {
		int number = MyConsole.readInput(6,"������� ������������ ������������� ��������:");
		View.print("�������������������� ���� ����� ="+Number.avgArithm(number));
		View.print("�������������������� ���� ����� ="+Number.avgGeom(number));
	}
}
