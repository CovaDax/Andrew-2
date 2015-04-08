package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class Cycle_DetectorTest {
	
	@Test
	public void testDefaultCon(){
		Cycle_Detector cd = new Cycle_Detector();
		assertNotNull(cd.getDetector());
		assertNotNull(cd.getG());
	}
	
	@Test
	public void assertNoClass(){
		Cycle_Detector cd = new Cycle_Detector();
		assertFalse(cd.createTree(null, null, new Random().nextInt()));
		assertEquals(cd.getG().edgeSet().size(),0);
	}
	
	@Test (expected = RuntimeException.class)
	public void testNothing(){
		throw new RuntimeException("Test");
	}
	
}
