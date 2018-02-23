/*
 * 
 *
 * @version 1.00
 *
 * @since 23 ����. 2018 �.
 *
 * @author Maskim Sardyka
 */


package by.epam.preTraining.nameOfStudent.tasks.task6.Queue;

public interface Queueable<T> {
	/*����� ��������� ������� � ����� �������;*/
	public void enqueue(T newElement);
	/*����� ������� ������ ������� � ������������� ��� ��������� �� �������� �������;*/
	public T dequeue();
	/*����� ���������� ������ ������� �� �������� �������; ������� ������ ������� ������� �� �������;*/
	public T peek();
	/*����� ���������� ����� ���������� ��������� � �������.*/
	public int size();
	/*����� ���������� ��������� �������� true, ���� ������� �������� ������, � ��������� ������ ����� ������ ���������� false;*/
	public boolean isEmpty();
	/*����� ���������� ��������� �������� true, ���� ������� ��������� ���������, � ��������� ������ ����� ������ ���������� false.*/
	public boolean isFull();
}
