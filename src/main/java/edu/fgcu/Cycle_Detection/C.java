package edu.fgcu.Cycle_Detection;


public class C {

	private int id;
	private B last;
	private A next;

	public C(int id){
		this.id = id;
	}
	
	public C(int id, A next, B last){
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
	
	public void setNext(A a){
		next = a;
	}
	
	public A getNext(){
		return next;
	}
	
	public void setLast(B b){
		last = b;
	}
	public B getLast(){
		return last;
	}
}