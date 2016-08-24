package com.nlsinc.java.FirstMavenProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	      System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
        System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Method");
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Method");
	}

	@Test
	public void firstTest() {
     int actual = cal.add(5, 5);
     int expected = 10;
     System.out.println("FIRST TEST");
     Assert.assertEquals(expected, actual);
      
	}
	
	@Test
	public void secondTest(){
		int actual = cal.sub(3, 3);
		int expected = 0;
		System.out.println("SECOND TEST");
		Assert.assertEquals(expected, actual);
	}
	
	
	 

}
