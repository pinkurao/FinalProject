package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FacebookAccount {
  
	
	WebDriver driver;
	By firstname = By.id("u_0_1");
	By lastname = By.id("u_0_3");
	By email = By.id("u_0_6");
	By reenteremail = By.id("u_0_9");
	By password = By.id("u_0_b");
	By month =By.xpath("//div[@class='_5k_5']//select[@id='month']//option[@value='3']");
	By day = By.xpath("//div[@class='_5k_5']//select[@id='day']//option[@value='7']");
	By year = By.xpath("//div[@class='_5k_5']//select[@id='year']//option[@value='1992']");
	By gender = By.id("u_0_f");
	By signupbutton = By.id("u_0_j");
	
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.getTitle();
	  System.out.println("BEFORE CLASS");
  }



  @Test(priority=0)
  public void firstNameEnter() throws InterruptedException {
	  driver.findElement(firstname).sendKeys("raju");
	  Thread.sleep(2000);
  }
  
  @Test(priority=1)
  public void lastNameEnter() throws InterruptedException{
	  driver.findElement(lastname).sendKeys("rao");
	  Thread.sleep(2000);
  }
  
  @Test(priority=2)
  public void emailEnter() throws InterruptedException{
	  driver.findElement(email).sendKeys("pavanpinku34@gmail.com");
	  Thread.sleep(2000);
  }
  
  @Test(priority=3)
  public void reEmailEnter() throws InterruptedException{
	  driver.findElement(reenteremail).sendKeys("pavanpinku34@gmail.com");
	  Thread.sleep(2000);
  }
  
  @Test(priority=4)
  public void passwordEnter() throws InterruptedException{
	  driver.findElement(password).sendKeys("pinku9160647577");
	  Thread.sleep(2000);
  }
  
  @Test(priority=5)
  public void birthday() throws InterruptedException{
	  driver.findElement(month).click();
	  driver.findElement(day).click();
	  driver.findElement(year).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=6)
  public void genderClick() throws InterruptedException{
	  driver.findElement(gender).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=7)
  public void signUp() throws InterruptedException {
	  driver.findElement(signupbutton).click();
	  Thread.sleep(2000);
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS");
	  driver.close();
	  
  }
}
