package edu.fgcu.Cycle_Detection;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

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
		A a = new A(id);
		B b = new B(id);
		C c = new C(id);
		a.setNext(b);
		a.setLast(c);
		assertEquals(a.getId(),id);
		assertEquals(b.getId(),id);
		assertEquals(c.getId(),id);
	}
	
	@Test
	public void testSetId(){
		int rand = new Random().nextInt();
		A a = new A(rand);
		assertEquals(a.getId(), rand);
	}
}
