package by.training.task1.part3;

public class Main {
	
	public static void main(String [] args) {
		int a=2;
		int b=4;
		View.print("�������� ��: a="+a+" b="+b+"\n");
		a=a+b-(b=a);
		View.print("�������� �����: a="+a+" b="+b+"\n");
	}
}
