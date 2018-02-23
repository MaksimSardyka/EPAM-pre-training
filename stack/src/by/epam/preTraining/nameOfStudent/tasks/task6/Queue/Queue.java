/*
 * 
 *
 * @version 1.00
 *
 * @since 23 февр. 2018 г.
 *
 * @author Maskim Sardyka
 */


package by.epam.preTraining.nameOfStudent.tasks.task6.Queue;

public class Queue<T> implements Queueable{
	private int INITIAL_SIZE = 1;
	private int INCREASE_STEP = 10;
	protected T[] masStorage;
	private int size;//current size

	@Override
	public void enqueue(T newElement) {
		if(isFull()) {
			
		}
		masStorage[++size]=newElement;
	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() {
		return masStorage[0];
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isFull() {
		return this.size == masStorage.length;
	}
	/**
	 * Class description goes here.
	 *
	 * @version 1.00 23 февр. 2018 г.
	 * @author Maksim Sardyka
	 */
}
