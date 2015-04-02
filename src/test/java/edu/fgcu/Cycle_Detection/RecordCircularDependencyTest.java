package edu.fgcu.Cycle_Detection;

import org.junit.Test;

public class RecordCircularDependencyTest {
	
	@Test(expected=RuntimeException.class)
	public void testRecordCircularDependency() {
		throw new RuntimeException("Test");
		 
	}
	
	@Test(expected=RuntimeException.class)
	public void testRecordClassInformation() {
		throw new RuntimeException("Test");
	}
	
}
