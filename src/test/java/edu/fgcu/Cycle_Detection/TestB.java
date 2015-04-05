package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestB {
	private B b;
	
	@Before
	public void setup(){
		b = new B(0);
	}
	
	@Test
	public void testCCon(){
		C c = new C(0);
		b.setNext(c);
		assertEquals(b.getNext(),c);
	}
}
