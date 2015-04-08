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
	public void testNoClass(){
		Cycle_Detector cd = new Cycle_Detector();
		assertEquals(cd.getG().edgeSet().size(),0);
	}
	
	@Test
	public void testCounter(){
		Cycle_Detector cd = new Cycle_Detector();
		assertFalse(cd.createTree(null, null, 0));
	}
	
	@Test
	public void testTree(){
		Cycle_Detector cd = new Cycle_Detector();
		cd.createTree("edu.fgcu.Cycle_Detection.A","edu.fgcu.Cycle_Detection.A", 10);
		assertTrue(cd.detectCycle());
	}
	
	@Test (expected = RuntimeException.class)
	public void testNothing(){
		throw new RuntimeException("Test");
	}
	
}
