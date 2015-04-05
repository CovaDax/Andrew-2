package edu.fgcu.Cycle_Detection;

import org.junit.Before;

public class Cycle_Tree_Test {
	private Cycle_Tree tree;
	
	@Before
	public void setup(){
		tree = new Cycle_Tree(new A(0));
	}
}
