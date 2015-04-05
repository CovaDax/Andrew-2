package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class TestA {
	
	//private B b;
	private A a;
	
	@Before
	public void setup(){
		a = new A(0);
	}
	
	@Test
	public void testA(int id, B next, C last){
		id = new Random().nextInt();
		A a = new A(id);
		next = new B(id);
		last = new C(id);
		a.setNext(next);
		a.setLast(last);
		assertEquals(a.getId(),id);
		assertEquals(a.getNext(),next);
		assertEquals(a.getLast(),last);
	}
	
	@Test
	public void testSetId(int id){
		id = new Random().nextInt();
		A a = new A(id);
		assertEquals(a.getId(), id);
	}
}
