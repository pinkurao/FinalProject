package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTest {
	
	int result;
  @Test
  public void registration() {
	  result =0;
	  System.out.println("registritation done");
	  //Assert.assertTrue(false);
  }
  
  @Test(dependsOnMethods=("registration"),alwaysRun=true,enabled=true)
  public void login(){
	  if(result ==0)
		  System.out.println("login done");
  }
}
