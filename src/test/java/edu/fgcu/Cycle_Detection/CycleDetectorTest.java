package edu.fgcu.Cycle_Detection;

import org.junit.Test;

public class CycleDetectorTest {
	

	@Test(expected = RuntimeException.class)
	public void testDetectCycles() {
		
		throw new RuntimeException("msg");
		 
	}
	
	@Test(expected = RuntimeException.class)
	public void testFindCycles() {
		
		throw new RuntimeException("msg");
	}
	
	@Test(expected = RuntimeException.class)
	public void testFindCyclesContainingVertex() {
		
		throw new RuntimeException("msg");
	}
	
	@Test(expected = RuntimeException.class)
	public void testExecute() {
		
		throw new RuntimeException("msg");
	}
	
	
}
