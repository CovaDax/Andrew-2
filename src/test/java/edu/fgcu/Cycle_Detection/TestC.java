package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class TestC {
	private C c;
	
	@Before
	public void setup(){
		c = new C(0);
	}
	
	@Test
	public void testC(){
		int id = new Random().nextInt();
		A next = new A(0);
		B last = new B(0);
		C c = new C(id,next,last);
		assertEquals(c.getId(), id);
		assertEquals(c.getLast(),last);
		assertEquals(c.getNext(),next);	
		
	}
	
	@Test
	public void testGetId(){
		C c = new C(0);
		assertNotNull(c.getId());
	}
	
	@Test
	public void testSetId(){
		C c = new C(0);
		int id = new Random().nextInt();
		c.setId(id);
		assertEquals(c.getId(), id);
	}
	
	@Test
	public void testSetNext(){
		C c = new C(0);
		A next = new A(0);
		c.setNext(next);
		assertEquals(c.getNext(),next);
	}
	
	@Test
	public void testSetLast(){
		C c = new C(0);
		B last = new B(0);
		c.setLast(last);
		assertEquals(c.getLast(), last);
	}
}
