package edu.fgcu.Cycle_Detection;


public class A {
	
	private B b;
	private String hello = "This is String A";

	public A(){
		//Causes infinite loop of object invokations
		this.b = new B();
	}
}