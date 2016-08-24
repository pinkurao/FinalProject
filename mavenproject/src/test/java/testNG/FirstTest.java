package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTest {
  @Test(priority=0)
  public void f() {
	  System.out.println("ACTUAL TEST");
  }
  @Test(priority=1)
  public void a() {
	  System.out.println("ACTUAL 2NS TEST");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method Test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class Test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class Test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite Test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite Test");
  }

}
