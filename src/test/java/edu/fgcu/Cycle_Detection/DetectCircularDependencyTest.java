package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DetectCircularDependencyTest {
	
	private A a;
	private B b;
	private C c;
	
	@Before
	public void setup(){
		a = new A();
		b = new B();
		c = new C();
	}
	
	//by class name checks to see that there IS a circular class dependency
	@Test
	public void testCheckCircularDependency(){
		A testA = a.getB().getC().getA();
		assertEquals(testA, a);
	}
	
	
	@Test(expected=RuntimeException.class)
	public void testDetectCircularDependency() {
		throw new RuntimeException("Test");
		 
	}

}
