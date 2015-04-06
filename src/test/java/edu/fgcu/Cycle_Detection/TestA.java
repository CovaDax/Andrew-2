package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

//TestA

public class TestA {
	
	//private B b;
	private A a;
	
	@Before
	public void setup(){
		a = new A(0);
	}
	
	@Test
	public void testA(){
		int id = new Random().nextInt();
		B b = new B(id);
		C c = new C(id);
		A a = new A(id, b, c);
		assertEquals(a.getId(),id);

		assertEquals(b, a.getNext());
		assertEquals(c, a.getLast());
	}
	
	@Test
	public void getId(){
		A a = new A(0);
		int id = new Random().nextInt();
		a.setId(id);
		assertEquals(a.getId(),id);
	}
	
	@Test
	public void testSetLast(){
		A a = new A(0);
		C c= new C(0);
		a.setLast(c);
		assertEquals(a.getLast(),c);
	}

	@Test
	public void testSetNext(){
		A a = new A(0);
		B b = new B(0);
		a.setNext(b);
		assertEquals(a.getNext(),b);
	}
	
	@Test
	public void testSetId(){
		int rand = new Random().nextInt();
		A a = new A(rand);
		assertEquals(a.getId(), rand);
	}
}
