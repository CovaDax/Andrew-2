package edu.fgcu.Cycle_Detection;

import org.junit.Test;

public class DetectCircularDependencyTest {
	
	@Test(expected=RuntimeException.class)
	public void testDetectCircularDependency() {
		throw new RuntimeException("Test");
		 
	}

}
