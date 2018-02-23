/*
 * 
 *
 * @version 1.00
 *
 * @since 23 февр. 2018 г.
 *
 * @author Maskim Sardyka
 */

package by.epam.preTraining.nameOfStudent.tasks.task6.Stack;

import by.epam.preTraining.nameOfStudent.tasks.task6.View.View;

public class MasStack<T> implements Stackable{
	private int INITIAL_SIZE = 1;
	private int INCREASE_STEP = 10;
	protected T[] masStorage;
	private int size;//current size

	/*
	 * Default constructor 
	 */
	@SuppressWarnings("unchecked")
	public MasStack(){
		this.masStorage =(T[]) new Object [INITIAL_SIZE];
		this.size = 0;
	}
	
	/*
	 * Constructor with parameter
	 */
	@SuppressWarnings("unchecked")
	public MasStack(int initSize){
		this.masStorage = (T[]) new Object [initSize];
		this.size = 0;
	}
	
	/*
	 * Copy constructor
	 */
	@SuppressWarnings("unchecked")
	public MasStack(MasStack<T> old){
		this.masStorage =(T[]) new Object [old.size];
		copy(old.masStorage, this.masStorage);
		this.size = old.size();
	}
	
	
	/*
	 * Copy stack elements
	 */
	private void copy(T[] from,T[] to) {
		if(to.length>=from.length) {
			for(int i = from.length-1; i >= 0; i--){
				to[i]=from[i];
			}
		} else {
			StackOutOfBoundsException e = new StackOutOfBoundsException();
			e.showError();
		}
	}
	
	/*
	 * add space if needed
	 */
	private void increaseSize(int additionalSize) {
		@SuppressWarnings("unchecked")
		T[] mas = (T[]) new Object[this.masStorage.length + additionalSize];
		copy(this.masStorage, mas);
		this.masStorage = mas;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void push(Object newElement) {
		if(isFull()){
			increaseSize(INCREASE_STEP);
		}
		this.masStorage[size] = (T) newElement;
		size++;
	}
	
	@Override
	public T pop() {
		T result = null;
		if(this.size!=0){
				result = this.masStorage[this.size-1];
			this.masStorage[this.size-1] = null;
			this.size--;
		} else {
			StackOutOfBoundsException e = new StackOutOfBoundsException();
			e.showError();
		}
		return result;
	}

	@Override
	public T peek() {
		T result = null;
		
		if(this.size!=0) {
			result = this.masStorage[this.size];
		} else {
			StackOutOfBoundsException e = new StackOutOfBoundsException();
			e.showError();
		}
		return result;
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
//		View.print(masStorage.length);
		return size == masStorage.length;
	}
	/**
	 * Class description goes here.
	 *
	 * @version 1.00 23 февр. 2018 г.
	 * @author Maksim Sardyka
	 */
}
