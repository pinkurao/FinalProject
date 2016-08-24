package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Yahoo {
 
	WebDriver driver;
	 By enterEmial = By.id("login-username");
	 By clickNext = By.id("login-signin");
	 By password = By.id("login-passwd");
	 By signIn = By.id("login-signin");
	 By click = By.id("yucs-profile");
	 By signOut =By.id("yucs-signout");
	
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  driver = new FirefoxDriver();
	  driver.get("https://login.yahoo.com/?.src=ym&.intl=us&.lang=en-US&.done=https%3a//mail.yahoo.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Thread.sleep(2000);
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS");
	  driver.close();
  }
  
  @AfterMethod
  public void output(ITestResult result) throws IOException{
	  if(ITestResult.FAILURE==result.getStatus()){
		  File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(scrnshot, new File("C://Users//pavan//Desktop//pavan"));
	  }
  }
  

  @Test(priority =0)
  public void enterEmail() throws InterruptedException {
	  
	  driver.findElement(enterEmial).sendKeys("rao.pavan9@yahoo.com");
	  driver.findElement(clickNext).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=1)
  public void passWord() throws InterruptedException{
	  driver.findElement(password).sendKeys("pinku9160647577");
	  driver.findElement(signIn).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=2)
  public void accountClick() throws InterruptedException {
	  Actions mouseActions = new Actions(driver);
	  WebElement we =driver.findElement(click);
	  mouseActions.moveToElement(we).build().perform();
	  Thread.sleep(2000);
	  
	  
  }
  
  @Test(priority=3)
  public void signOut() throws InterruptedException{
	  driver.findElement(signOut).click();
	  Thread.sleep(2000);
  }
}
