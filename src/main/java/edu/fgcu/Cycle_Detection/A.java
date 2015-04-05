package edu.fgcu.Cycle_Detection;


public class A {
	
	private int id;
	private C last;
	private B next;

	public A(int id){
		this.id = id;
	}
	
	public A(int id, B next, C last){
		this.id = id;
		this.next = next;
		this.last = last;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setNext(B b){
		next = b;
	}
	
	public B getNext(){
		return next;
	}
	
	public void setLast(C c){
		last = c;
	}
	public C getLast(){
		return last;
	}
}