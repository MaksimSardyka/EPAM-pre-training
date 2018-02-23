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

public interface Queueable<T> {
	/*метод добавляет элемент в конец очереди;*/
	public void enqueue(T newElement);
	/*метод удаляет первый элемент с одновременным его возвратом из непустой очереди;*/
	public T dequeue();
	/*метод возвращает первый элемент из непустой очереди; методне должен удалять элемент из очереди;*/
	public T peek();
	/*метод возвращает общее количество элементов в очереди.*/
	public int size();
	/*метод возвращает булевское значение true, если очередь является пустой, в противном случае метод должен возвращать false;*/
	public boolean isEmpty();
	/*метод возвращает булевское значение true, если очередь полностью заполнена, в противном случае метод должен возвращать false.*/
	public boolean isFull();
}
