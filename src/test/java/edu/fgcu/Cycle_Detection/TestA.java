package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

//TestA

public class TestA {
	
	//private B b;
	private A a;
	
	@Before
	public void setup(){
		a = new A();
	}
	
	@Test
	public void testBCon(){
		B b = new B();
		a.setB(b);
		assertEquals(a.getB(), b);
	}
}
