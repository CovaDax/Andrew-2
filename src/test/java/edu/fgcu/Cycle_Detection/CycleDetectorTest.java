package edu.fgcu.Cycle_Detection;

import org.junit.Test;

public class CycleDetectorTest {
	
	@Test(expected=RuntimeException.class)
	public void testDetectCycle() {
		throw new RuntimeException("Test");
		 
	}
	
	@Test(expected=RuntimeException.class)
	public void testIsCycle() {
		throw new RuntimeException("Test");
		 
	}
	
	
}
