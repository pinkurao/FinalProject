package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class GmailTest {
 
	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.gmail.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Thread.sleep(2000);
	 
  }

  @Test(priority=0)
  public void email() throws InterruptedException {
	  WebElement emailButton = driver.findElement(By.id("Email"));
	  emailButton.sendKeys("rao.pavan99@gmail.com");
	 // emailButton.click();
	  Thread.sleep(2000);
  }
  
  
  
  
  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
