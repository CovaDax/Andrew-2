package edu.fgcu.Cycle_Detection;

import java.lang.reflect.Field;
import java.util.Set;

import org.jgrapht.alg.CycleDetector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.ListenableDirectedGraph;


public class Cycle_Detector {
	private ListenableDirectedGraph<String, String> g;
	private CycleDetector detector;

	public Cycle_Detector(){
		g = new ListenableDirectedGraph(DefaultEdge.class);
		detector = new CycleDetector(g);
	}

	public boolean createTree(String head, String className, int count) {
		if(count < 1){
			return false;
		}
			Class aClass;
			try {
				aClass = Class.forName(className);
			} catch (ClassNotFoundException e) {
				return false;
			}
		if(!g.containsVertex(aClass.getSimpleName())){ g.addVertex(aClass.getSimpleName()); };
		Field[] fields = aClass.getDeclaredFields();
		for(Field f : fields){
			Class c = f.getType();
			if(!g.containsVertex(c.getSimpleName())){ g.addVertex(c.getSimpleName()); };
				g.addEdge(aClass.getSimpleName(), c.getSimpleName());
			createTree(head,c.getName(), count-1);
			
		}
		return false;
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
	
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) throws ClassNotFoundException{
//		String aName = "edu.fgcu.Cycle_Detection.A";
//		String[] classNames = {	"edu.fgcu.Cycle_Detection.A",
//								"edu.fgcu.Cycle_Detection.B",
//								"edu.fgcu.Cycle_Detection.C" };
//		Cycle_Detector cycle = new Cycle_Detector();
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
