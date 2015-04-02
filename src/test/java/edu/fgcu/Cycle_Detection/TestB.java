package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestB {
	private B b;
	
	@Before
	public void setup(){
		b = new B();
	}
	
	@Test
	public void testCCon(){
		C c = new C();
		b.setC(c);
		assertEquals(b.getC(),c);
	}
}
