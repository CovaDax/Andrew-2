package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class TestB {
	private B b;
	
	@Before
	public void setup(){
		b = new B(0);
	}
	
	@Test
	public void testB(){
		int id = new Random().nextInt();
		A last = new A(id);
		C next = new C(id);
		B b = new B(id, next, last);
		assertEquals(b.getLast(), last);
		assertEquals(b.getNext(), next);
	}
	
	@Test
	public void testGetId(){
		B b = new B(0);
		assertNotNull(b.getId());
	}
	
	@Test
	public void testSetId(){
		int rand = new Random().nextInt();
		B b = new B(rand);
		assertEquals(b.getId(), rand);
	}
	
	@Test
	public void testGetNext(){
		B b = new B(0);
		int id = new Random().nextInt();
		b.setId(id);
		assertEquals(b.getId(), id);
	}
	
	@Test
	public void testGetLast(){
		B b = new B(0);
		A last = new A(0);
		b.setLast(last);
		assertEquals(b.getLast(),last);
	}
	
}
