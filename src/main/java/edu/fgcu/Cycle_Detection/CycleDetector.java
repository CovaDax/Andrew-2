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
	
	
    /*
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
	
	
    /*
     *  Execute probeIterator
     */
    
    private void execute(Set<V> s, V v) {
        ProbeIterator iter = new ProbeIterator(s, v);

        while (iter.hasNext()) {
            iter.next();
        }
    }
	

    /*
     * Finds the vertex set of a subgraph
     * 
     */
    
    public Set<V> findCycles() {
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	public static void main(String [] args){
		
		System.out.println("This is a Cycle Detection program!!!");
		
	}
		
}
