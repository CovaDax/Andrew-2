package edu.fgcu.Cycle_Detection;

import java.lang.reflect.Field;
import java.util.Random;

import org.jgraph.JGraph;
import org.jgrapht.*;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.*;


public class Cycle_Detector {
	ListenableGraph<String, String> g;
	
	public Cycle_Detector(String[] classes){
	     // create a JGraphT graph
	     g = new ListenableDirectedGraph(DefaultEdge.class);
	     for(String cycleClass : classes){
	    	 g.addVertex(cycleClass);	     
	     }
	}

	public boolean detectCycle(String head, String className, int count) throws ClassNotFoundException{
		Class aClass = Class.forName(className);
		Field[] fields = aClass.getDeclaredFields();
		for(Field f : fields){
			Class c = f.getType();
			if(c.getName().equals(head)){
				return true;
			} else if(detectCycle(head,c.getName(), count-1)){
				return true;
			} else if(count < 1)
				return false;
		}
		return false;
	}
//	
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) throws ClassNotFoundException{
//		String aName = "edu.fgcu.Cycle_Detection.A";
//		String[] classNames = {	"edu.fgcu.Cycle_Detection.A",
//								"edu.fgcu.Cycle_Detection.B",
//								"edu.fgcu.Cycle_Detection.C"};
//		Cycle_Detector cycle = new Cycle_Detector(classNames);
////		
////		cycle.testCycle(aName);
////		
////		ListenableGraph g = cycle.getGraph();
////		if(g.containsEdge(aName, aName)){
////			System.out.println("Reflective Cycle Detected");
////		} 
////		
////		if(g.containsEdge(aName, bName) && g.containsEdge(bName, aName)){
////			System.out.println("A->B B<-A Cycle Detected");
////		}
//		
//		if(cycle.detectCycle(aName, aName, 10)){
//			System.out.println("Cycle Detected");
//		} else {
//			System.out.println("Cycle Not Detected");
//		}
//	}
}
