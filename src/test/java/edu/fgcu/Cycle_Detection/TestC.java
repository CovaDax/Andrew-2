package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestC {
	private C c;
	
	@Before
	public void setup(){
		c = new C();
	}
	
	@Test
	public void testACon(){
		A a = new A();
		c.setA(a);
		assertEquals(c.getA(),a);
	}
}
