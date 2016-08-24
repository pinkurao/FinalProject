package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestExmple {
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE CLASS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS");
  }
  
  @Test(priority=0)
  public void name() {
	  System.out.println("PAVAN");
	  
  }
  
  @Test(priority=2)
  public void tech(){
	  System.out.println("QA AUTOMATION");
  }

}
