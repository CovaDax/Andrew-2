package edu.fgcu.Cycle_Detection;

public class DetectCircularDependency {

	protected boolean isDetected = false;
	private A a;
	private B b;
	private C c;
	
	public void detectCircularDependency(A a, B b, C c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void checkForDependency(){
		a.setB(b);
		a.getB().setC(c);
		a.getB().getC().setA(a);
	}
	
}
