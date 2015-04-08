package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cycle_DetectorTest {
	
	@Test
	public void testDefaultCon(){
		Cycle_Detector cd = new Cycle_Detector();
		assertNotNull(cd.getDetector());
		assertNotNull(cd.getG());
	}
	@Test (expected = RuntimeException.class)
	public void testNothing(){
		throw new RuntimeException("Test");
	}
	
}
