package edu.fgcu.Cycle_Detection;


public class A {
	
	private B b;
	private String hello = "This is String A";

	public A(){
		//Causes infinite loop of object invocations
	}
	
	public void setB(B b){
		this.b = b;
	}
	
	public B getB(){
		return this.b;
	}
}