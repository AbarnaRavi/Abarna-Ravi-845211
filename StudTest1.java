package com.practice;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Test;

public class StudTest1 {
	Student s1=new Student();

	@Test
	public void test11() {
		//fail("Not yet implemented");
		s1.setSid(1001);
		s1.setName("Ayesha");
		assertEquals(1001,s1.getSid());
		assertEquals("Ayesha",s1.getName());
		
		
		
	}

}
