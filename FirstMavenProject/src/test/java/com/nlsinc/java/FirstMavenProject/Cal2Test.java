package com.nlsinc.java.FirstMavenProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class Cal2Test {
	Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Method");
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void mulTest() {
      
		int actual = cal.mul(2, 3);
		int expected =6;
		System.out.println("Mul Test");
		Assert.assertEquals(expected, actual);

	}

	@Test(expected = ArithmeticException.class)
	public void divTest() {
		int actual = cal.div(2, 0);
		double expected=0;
		System.out.println("Div Test");
	}	
		
	    @Ignore
		@Test(timeout=1000)
		public void infiniteTest(){
			cal.infinte();
			
		}
	
}
