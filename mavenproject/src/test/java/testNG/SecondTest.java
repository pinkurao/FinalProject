package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {
	@Test
	  public void f() {
		  System.out.println("ACTUAL  Second TEST");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method SECOND Test");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After Method SECOND Test");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before Class SECOND Test");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("After class SECOND Test");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test SECOND Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Class SECOND Test");
	  }
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Before Suite SECOND Test");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("After suite SECOND Test");
	  }

}