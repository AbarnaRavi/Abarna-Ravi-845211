/**
 * 
 */
package com.practice;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author HP
 *
 */
@RunWith(Parameterized.class)

public class ParameterizedTest1 {
	int expected;
	int actualinput;
	public ParameterizedTest1(int expected,int actualinput)
	{
		super();
		this.expected=expected;
		this.actualinput=actualinput;
		System.out.println("const:"+expected+" "+actualinput);
	}
	@Parameters
	public static Collection<Object[]>add12(){
		return Arrays.asList(new Object[][]{
			{4,2},{9,3},{16,4}});
			
		}
	

	@Test
	public void sum() {
		//fail("Not yet implemented");
		Calc g=new Calc();
		assertEquals(expected,g.taxcal(actualinput));
	}

}
