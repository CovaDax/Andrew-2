package edu.fgcu.Cycle_Detection;

import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

import javax.swing.JApplet;

import org.jgraph.JGraph;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.ListenableDirectedGraph;

/**
 * A demo applet that shows how to use JGraph to visualize JGraphT graphs.
 *
 * @author Barak Naveh
 *
 * @since Aug 3, 2003
 */
public class CycleGrapher extends JApplet {
    private static final Color     DEFAULT_BG_COLOR = Color.decode( "#FAFBFF" );
    private static final Dimension DEFAULT_SIZE = new Dimension( 530, 320 );

    // 
    private JGraphModelAdapter m_jgAdapter;

    /**
     * @see java.applet.Applet#init().
     */
    
    ListenableDirectedGraph<String, String> g;
    
    public void init(  ) {
        // create a JGraphT graph
        g = new ListenableDirectedGraph( DefaultEdge.class );

        // create a visualization using JGraph, via an adapter
        m_jgAdapter = new JGraphModelAdapter( g );

        JGraph jgraph = new JGraph( m_jgAdapter );

        adjustDisplaySettings( jgraph );
        getContentPane(  ).add( jgraph );
        resize( DEFAULT_SIZE );

        detectCycle("edu.fgcu.Cycle_Detection.A","edu.fgcu.Cycle_Detection.A",10);

        findCycle();

        // that's all there is to it!...
    }
    
//    public void detectCycles(String head) {
//    	try {
//			Class node = Class.forName(head);
//	    	g.addVertex(node.getClass().getSimpleName());
//			Field[] fields = node.getDeclaredFields();
//			for(Field f : fields){
//				System.out.println(f.getType().getSimpleName());
//				if(!g.containsVertex(f.getType().getSimpleName())){ g.addVertex(f.getType().getSimpleName()); }
//				g.addEdge(node.getSimpleName(), f.getType().getSimpleName());
//				Field[] fields2 = f.getType().getDeclaredFields();
//				for(Field f2 : fields2){
//					if(!g.containsVertex(f2.getType().getSimpleName())){ g.addVertex(f2.getType().getSimpleName()); }
//					g.addEdge(f.getType().getSimpleName(), f2.getType().getSimpleName());
//				}
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
    
	public boolean detectCycle(String head, String className, int count) {
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
			detectCycle(head,c.getName(), count-1);
			
		}
		return false;
	}
	
	public boolean findCycle(){
		CycleDetector cycle = new CycleDetector(g);
		return cycle.detectCycles();
	}
	
	public boolean findCycleContaining(String className){
		CycleDetector cycle = new CycleDetector(g);
		return cycle.detectCyclesContainingVertex("A");
	}


    private void adjustDisplaySettings( JGraph jg ) {
        jg.setPreferredSize( DEFAULT_SIZE );

        Color  c        = DEFAULT_BG_COLOR;
        String colorStr = null;

        try {
            colorStr = getParameter( "bgcolor" );
        }
         catch( Exception e ) {}

        if( colorStr != null ) {
            c = Color.decode( colorStr );
        }

        jg.setBackground( c );
    }


}