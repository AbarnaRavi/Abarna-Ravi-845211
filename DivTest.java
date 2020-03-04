package com.practice;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Test;

public class DivTest {
        Division obj1=new Division(10,2);
        Division obj2=new Division(10,0);
	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("First Test case");
		assertEquals(5,obj1.division());
		
	}
	@Test(expected=ArithmeticException.class)
	public void test1()
	{
		System.out.println("Second Test case");
		assertEquals(5,obj2.division());
		
	}
	@Test(expected=ArithmeticException.class)
	public void ArithExcep2()
	{
		throw new NullPointerException();
		
	}
	

}
