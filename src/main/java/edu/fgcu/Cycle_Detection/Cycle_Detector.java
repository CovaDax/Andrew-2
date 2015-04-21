package edu.fgcu.Cycle_Detection;

import java.awt.List;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.jgrapht.alg.CycleDetector;
import org.jgrapht.alg.KShortestPaths;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.ListenableDirectedGraph;


public class Cycle_Detector {
	private ListenableDirectedGraph g;
	private CycleDetector detector;

	public Cycle_Detector(){
		g = new ListenableDirectedGraph(DefaultEdge.class);
		detector = new CycleDetector(g);
	}

	public void createTree(String className) {

		Class aClass = null;
		try {
			aClass = Class.forName(className);
		} catch (ClassNotFoundException e) {
			
		}
		Field[] fields = aClass.getDeclaredFields();
		for(Field f : fields){
			Class c = f.getType();
			addEdge(aClass.getSimpleName(), c.getSimpleName());
		}
	}
	
	public void addEdge(Object start, Object end){
		if(!g.containsVertex(start)){ g.addVertex(start); }
		if(!g.containsVertex(end)){ g.addVertex(end); }
		g.addEdge(start, end);
	}
	
	public boolean detectCycle(){
		return detector.detectCycles();
	}
	
	public boolean detectCycleContaining(Object className){
		return detector.detectCyclesContainingVertex(className);
	}
	
	public Set findCycles(){
		return detector.findCycles();
	}
	
	public Set findCyclesContaining(Object className){
		return detector.findCyclesContainingVertex(className);
	}
	
	public ListenableDirectedGraph getG(){
		return g;
	}
	
	public CycleDetector getDetector(){
		return detector;
	}
}
