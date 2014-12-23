/* 
     Name:  Sean Staz
     Email:  seanstaz52@gmail.com
     Current Date:  9/17/2013
     Class: CSci 211 Section 1 Fall 2013
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 

package e1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularArrayTest {

	@Test
	public void testCapacity1() {
	CircularArray c = new CircularArray(5);
	assertEquals(5, c.getCapacity());
	}

	@Test
	public void empty1() {
	CircularArray c = new CircularArray(5);
	assertTrue(c.isEmpty());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constructor1() {
	CircularArray c = new CircularArray(0);
	}
	
	@Test
	public void enqueue1(){
	CircularArray c = new CircularArray(5);
	c.enqueue(1);
	assertTrue(c.queue[0] == 1);
	}
	
	@Test
	public void dequeue1(){
	CircularArray c = new CircularArray(5);
	c.enqueue(1);
	c.dequeue();
	assertTrue(c.isEmpty());
	}
	
	@Test
	public void clear1(){
	CircularArray c = new CircularArray(5);
	c.enqueue(1);
	c.enqueue(3);
	c.clear();
	assertTrue(c.isEmpty());
	}
	
	@Test
	public void full1(){
	CircularArray c = new CircularArray(5);
	c.enqueue(1);
	c.enqueue(3);
	c.enqueue(5);
	c.enqueue(7);
	c.enqueue(9);
	assertTrue(c.isFull());
	}
	
	@Test
	public void full2(){
	CircularArray c = new CircularArray(5);
	c.enqueue(1);
	c.enqueue(3);
	c.enqueue(5);
	c.enqueue(7);
	assertFalse(c.isFull());
	}
}
