package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DataProviderTest {
 

  @DataProvider(name ="EMP")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Pavan","Thakkaleplly","Amazon" },
      new Object[] { "Mahesh", "Aleti","Ebay" },
      new Object[] { "Shravan", "Sreepathi","Apple" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  @Test(dataProvider = "EMP")
  public void empData(String fname , String lname, String company) {
	  System.out.println(fname+" "+lname+" --"+company);
  }

}
