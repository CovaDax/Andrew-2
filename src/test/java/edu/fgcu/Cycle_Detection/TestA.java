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
	public void testCon(){
		int id = new Random().nextInt();
		B b = new B(0);
		C c = new C(0);
		a.setNext(b);
		a.setLast(c);
		assertEquals(a.getId(),id);
		assertEquals(a.getNext(),b);
		assertEquals(a.getLast(),c);
	}
}
