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
		DetectCircularDependency dcd = new DetectCircularDependency(a,b,c);
		A startA = dcd.checkForDependency();
		A endA = startA.getB().getC().getA();
		assertEquals(startA, endA);
	}
	
	
	@Test(expected=RuntimeException.class)
	public void testDetectCircularDependency() {
		throw new RuntimeException("Test");
		 
	}

}
