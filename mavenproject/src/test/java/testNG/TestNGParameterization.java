package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class TestNGParameterization {
 
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @Parameters({"fname","lname","company"})
  @Test
  public void Employee(String fname , String lname, String company) {
	  System.out.println(fname +" "+lname+" --"+company);
  }
}
