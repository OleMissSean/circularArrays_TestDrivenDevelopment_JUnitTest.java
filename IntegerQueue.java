/**
 * 
 */
package e1;

import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;

/**  A queue works much like a line of people waiting for the teller window at the bank. The person at
 * the front of the queue is next to be served and to leave the queue. Newly arrived customers are added
 * at the back of the queue. 
 * 
 * Consider an element x that is added to the queue (enqueued). Any elements that were enqueued before x
 * are considered to be ahead of x. All elements ahead of x will need to be removed (dequeued) before x can be 
 * dequeued.
 * 
 * This Queue interface assumes the elements in the queue are ints.
 *
 * @author rhodes
 *
 */
public interface IntegerQueue {

	/** Add an integer x to the Queue. This is an enqueue operation,
	 * so x is added to the back of the queue. Any elements added before x will
	 * be returned by calls to dequeue() before x.
	 * 
	 * @param x the integer to be added to the back of the queue.
	 */
	
	public void enqueue(int x);
	
	
	/** Dequeue an integer from the front of the queue. Of the all the integers currently
	 * in the Queue, this method will return the integer least recently enqueued, also
	 * removing it from the Queue. 
	 * 
	 * If this Queue is empty, a java.util.NoSuchElementException is thrown.
	 * 
	 * @return the integer at the front of the queue.
	 * @throws NoSuchElementException
	 */
	
	public int dequeue();


	/** Return the number of elements currently in the queue.
	 * 
	 * @return the number of elements.
	 */
	
	public int getNumElements();
	
	

	/** Indicate whether this queue is empty.
	 * 
	 * @return true if the queue is empty, false otherwise.
	 */
	public boolean isEmpty();


}
