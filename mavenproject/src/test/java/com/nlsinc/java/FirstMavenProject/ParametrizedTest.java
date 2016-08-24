package com.nlsinc.java.FirstMavenProject;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class ParametrizedTest {
	
	private static int a;
	private static int b;
	private static int expected;
	
	public  ParametrizedTest(int a, int b, int expected){
		this.a=a;
		this.b=b;
		this.expected=expected;
	}

	@Parameters
	public static Collection getData(){
		return Arrays.asList(new Object[][]{{1,1,2},{2,2,4},{4,4,8},{5,3,8}});
	}
	
	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		Calculator cal = new Calculator();
		junit.framework.Assert.assertEquals(expected, cal.add(a, b));
		
	}

}
