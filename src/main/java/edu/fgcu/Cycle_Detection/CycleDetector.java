package edu.fgcu.Cycle_Detection;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.traverse.*;


public class CycleDetector<V,E> {
	
	/*
	 * Graph object where cycle detection is performed
	 */
	
	DirectedGraph<V, E> graph;
	
	/*
	 * Cycle detector for the specified graph
	 */
	
    public CycleDetector(DirectedGraph<V, E> graph) {
    	
    	this.graph = graph;
    }
	
	
    /**
     * Performs yes/no cycle detection on the graph
     */
    
    public boolean detectCycles() {
    	
        try {
            execute(null, null);
        } catch (CycleDetectedException ex) {
            return true;
        }

        return false;
    }
	
	
	
	

    
    
    
    
	public static void main(String [] args){
		
		System.out.println("This is a Cycle Detection program!!!");
		
	}
		
}
