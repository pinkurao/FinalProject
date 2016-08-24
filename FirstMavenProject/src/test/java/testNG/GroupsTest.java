package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GroupsTest {
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Cars Test ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("End of Cars Test  ");
  }
  
  @Test(groups={"BMW","SUV"})
  public void BMWX5(){
	  System.out.println("BMWX5");
  }

  
  @Test(groups={"BMW","SUV","Premium"})
  public void BMWX6(){
	  System.out.println("BMWX6");
  }
  
  @Test(groups={"BMW","Sedan"})
  public void BMW328i(){
	  System.out.println("BMW328i");
  }
  
  @Test(groups={"AUDI","SUV"})
  public void AUDIQ7(){
	  System.out.println("AUDIQ7");
  }
  
  @Test(groups={"AUDI","SUV","Premium"})
  public void AUDIA6(){
	  System.out.println("AUDIA6");
  }
  @Test(groups={"AUDI","Sedan"})
  public void AUDIA4(){
	  System.out.println("AUDIA4");
  }
  @Test(groups={"Honda","Sedan"})
  public void HondaCity(){
	  System.out.println("HondaCity");
  }
  @Test(groups={"Maruti","HatchBack"})
  public void MarutiSwift(){
	  System.out.println("MarutiSwift");
  }
  @Test(groups={"Maruti","Basic"})
  public void Alto(){
	  System.out.println("Alto");
  }
}
