/**
 * 
 */
package e1;

import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;

/** CircularArray is a simple array-based implementation of a queue that stores ints.
 * A queue works much like a line of people waiting for the teller window at the bank. The person at
 * the front of the queue is next to be served and to leave the queue. Newly arrived customers are added
 * at the back of the queue. 
 * 
 * Consider an element x that is added to the queue (enqueued). Any elements that were enqueued before x
 * are considered to be ahead of x. All elements ahead of x will need to be removed (dequeued) before x can be 
 * dequeued.
 * 
 * @assigned by rhodes
 * @author Sean Staz
 */
public class CircularArray implements IntegerQueue
{
	int[] queue;
	int front;
	int rear;
	int numElements;


	public CircularArray(int cap) throws IllegalArgumentException
	{
		// TODO Auto-generated constructor stub
		if(cap == 0)
			throw new IllegalArgumentException("Cannot create queue of 0 size.");
		
		this.queue = new int [cap];
		numElements = 0;
	}

	public void clear()
	{
		//Remove all elements from this CircularArray, making it empty.
		
		queue = null;
		
		front = rear = numElements = 0;
	}
		 
	public int dequeue() throws IllegalArgumentException
	{
		//Dequeue an integer from the front of the queue.
		
		if (isEmpty())
		{
			throw new IllegalArgumentException("Queue is empty.");
		}
		
		int result = queue[front];

		front = (front+1) % queue.length;
		
		front++;
		numElements--;
		
		return result;
	}
		 
	public void enqueue(int x)
	{
		//Add an integer x to the CircularArray.
		
		queue[rear] = x;
		rear = (rear+1) % queue.length;
		
		numElements++;
	}
		 
	public int getCapacity()
	{
		//Return the maximum number of elements this CircularArray can hold.
		
		return queue.length;
	}
	
	public int getNumElements()
	{
		//Return the number of elements currently in the CircularArray.
		
		return numElements;
	}
	
	public boolean isEmpty()
	{
		//Indicate whether this CircularArray is empty.
		
		if (numElements == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		 
	public boolean isFull()
	{
		//Indicate whether this CircularArray is full.
		
		if (queue.length == numElements)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
