package edu.fgcu.Cycle_Detection;


public class B {
	
	private int id;
	private A last;
	private C next;

	public B(int id){
		this.id = id;
	}
	
	public B(int id, C next, A last){
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
	
	public void setNext(C c){
		next = c;
	}
	
	public C getNext(){
		return next;
	}
	
	public void setLast(A a){
		last = a;
	}
	
	public A getLast(){
		return last;
	}
}