package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Assert;
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
	public void testTree(){
		Cycle_Detector cd = new Cycle_Detector();
		cd.createTree("edu.fgcu.Cycle_Detection.A");
		assertTrue(!cd.getG().edgeSet().isEmpty());
	}
	
	@Test(expected=NullPointerException.class)
	public void testClassNotExist(){
		Cycle_Detector cd = new Cycle_Detector();
		cd.createTree("This.is.not.a.class");
	}
	
	@Test
	public void testDetectCycle(){
		Cycle_Detector cd = new Cycle_Detector();
		cd.createTree("edu.fgcu.Cycle_Detection.A");
		cd.createTree("edu.fgcu.Cycle_Detection.B");
		cd.createTree("edu.fgcu.Cycle_Detection.C");
		assertTrue(cd.detectCycle());
		assertTrue(cd.detectCycleContaining("A"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testClassNotFound(){
		Cycle_Detector cd = new Cycle_Detector();
		cd.detectCycleContaining("Something");
	}
	
	@Test
	public void testFindCycle(){
		Cycle_Detector cd = new Cycle_Detector();
		cd.createTree("edu.fgcu.Cycle_Detection.A");
		cd.createTree("edu.fgcu.Cycle_Detection.B");
		cd.createTree("edu.fgcu.Cycle_Detection.C");
		assertNotNull(cd.findCycles());
		assertNotNull(cd.findCyclesContaining("A"));
	}
	
	
}
