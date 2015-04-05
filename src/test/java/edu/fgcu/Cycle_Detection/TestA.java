package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

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
	public void testBCon(){
		B b = new B(0);
		a.setNext(b);
		assertEquals(a.getNext(), b);
	}
}
