package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Cycle_Tree_Test {
	private Cycle_Tree tree;
	
	@Before
	public void setup(){
		tree = new Cycle_Tree(new A(0));
	}
	
	@Test
	public void testGetHead(){
		assertNotNull(tree.getHead());
	}
}
