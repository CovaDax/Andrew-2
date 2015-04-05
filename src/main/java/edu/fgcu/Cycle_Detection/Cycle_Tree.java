package edu.fgcu.Cycle_Detection;

public class Cycle_Tree {
	
	private A head;
	
	public Cycle_Tree(A a){
		this.head = a;
	}
	
	/**
	 * @param level
	 */
	public void createTree(int level){
		//stating node a
		A head;
		B center = new B(0,null,this.head);
		C end = new C(0,this.head,center);
		center.setNext(end);
		this.head.setNext(center);
		this.head.setLast(end);
		for(int i=1; i<level+1; i++){
			head = new A(i, null, end);
			end.setNext(head);
			center = new B(i, null, head);
			end = new C(i, this.head, center);
			head.setNext(center);
			center.setNext(end);
			this.head.setLast(end);
		}
		
		
	}
	
	public A getHead(){
		return head;
	}
//	
//	public static void main(String args[]){
//		Cycle_Tree tree = new Cycle_Tree(new A(0));
//		tree.createTree(5);
//		A head = tree.getHead();
//		B center = head.getNext();
//		C end = center.getNext();
//		for(int i=0; i<7; i++){
//			System.out.println("CLASS: " + head.getClass().getSimpleName() + 
//								" ID: " + head.getId());
//			head = end.getNext();
//			System.out.println("CLASS: " + center.getClass().getSimpleName() + 
//					" ID: " + center.getId());
//			center = head.getNext();
//			System.out.println("CLASS: " + end.getClass().getSimpleName() + 
//					" ID: " + end.getId());
//			end = center.getNext();
//		}
//	}
//	
}
