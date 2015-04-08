package edu.fgcu.Cycle_Detection;

import java.util.*;

import org.jgrapht.*;
import org.jgrapht.alg.StrongConnectivityInspector;
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
        } catch (Exception ex) {
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
    	
        StrongConnectivityInspector<V, E> inspector =
                new StrongConnectivityInspector<V, E>(graph);
            List<Set<V>> components = inspector.stronglyConnectedSets();
            
            Set<V> set = new HashSet<V>();
            for (Set<V> component : components) {
                if (component.size() > 1) {
                    // cycle
                    set.addAll(component);
                } else {
                    V v = component.iterator().next();
                    if (graph.containsEdge(v, v)) {
                        // self-loop
                        set.add(v);
                    }
                }
            }

            return set;    	
    }
    
    
    
    public Set<V> findCyclesContainingVertex(V v) {
        Set<V> set = new HashSet<V>();
        execute(set, v);

        return set;
    }
    

    
    
private class ProbeIterator extends DepthFirstIterator<V, E> {
   
	private List<V> path;
    private Set<V> cycleSet;
    private V root;

    ProbeIterator(Set<V> cycleSet, V startVertex) {
        super(graph, startVertex);
        root = startVertex;
        this.cycleSet = cycleSet;
        path = new ArrayList<V>();
    }
    
    
    @Override protected void encounterVertexAgain(V vertex, E edge)
    {
        super.encounterVertexAgain(vertex, edge);

        int i;

        if (root != null) {
            // For rooted detection, the path must either
            // double back to the root, or to a node of a cycle
            // which has already been detected.
            if (vertex.equals(root)) {
                i = 0;
            } else if ((cycleSet != null) && cycleSet.contains(vertex)) {
                i = 0;
            } else {
                return;
            }
        } else {
            i = path.indexOf(vertex);
        }

        if (i > -1) {
            if (cycleSet == null) {
                // we're doing yes/no cycle detection
                try {
					throw new Exception();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            } else {
                for (; i < path.size(); ++i) {
                    cycleSet.add(path.get(i));
                }
            }
        }
    }
    
    
    @Override protected V provideNextVertex()
    {
        V v = super.provideNextVertex();

        
        for (int i = path.size() - 1; i >= 0; --i) {
            if (graph.containsEdge(path.get(i), v)) {
                break;
            }

            path.remove(i);
        }

        path.add(v);

        return v;
    }
}
    
    
	public static void main(String [] args){
		
		System.out.println("This is a Cycle Detection program!!!");
		
	}
		
}
