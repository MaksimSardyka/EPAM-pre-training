/*
 * Node.java
 *
 * @version 1.00
 *
 * @since 01 March 2018
 *
 * @author Maskim Sardyka
 */


package by.epam.task5.part2;

/**
 * Class for single entity
 *
 * @version 1.00 
 * 
 * since 1 May 2018
 * 
 * @author Maksim Sardyka
 */
public class Node<T> {
    private T previous;
    private T current;
    private T next;
    
    private static int counter;
    
    Node(){
	
    };
    
    Node(Node<T> previuos, T element){
	Node<T> addThis = new Node<>();
	
	addThis.current = element;
	previuos.next = addThis.current;
	addThis.previous = previuos.current;
	counter ++;
    }
    
    T getPrevious() {
        return previous;
    }
    void setPrevious(T previous) {
        this.previous = previous;
    }
    T getCurrent() {
        return current;
    }
    void setCurrent(T current) {
        this.current = current;
    }
    T getNext() {
        return next;
    }
    void setNext(T next) {
        this.next = next;
    }
    
    
}
