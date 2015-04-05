package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestC {
	private C c;
	
	@Before
	public void setup(){
		c = new C(0);
	}
	
	@Test
	public void testACon(){
		A a = new A(0);
		c.setNext(a);
		assertEquals(c.getNext(),a);
	}
}
