package edu.fgcu.Cycle_Detection;

import org.junit.Test;

public class CycleDetectorTest {
	

	@Test(expected = RuntimeException.class)
	public void testDetectCycles() {
		
		throw new RuntimeException("msg");
		 
	}
	
	@Test(expected = RuntimeException.class)
	public void testFindCycles() {
		
		 
	}
	
	
}
