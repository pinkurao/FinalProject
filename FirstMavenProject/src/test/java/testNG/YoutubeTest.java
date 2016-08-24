package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.RootLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class YoutubeTest {
 
	WebDriver driver;
	
	By search =By.id("masthead-search-term");
	By click = By.id("search-btn");
	By select =By.xpath("//div[@id='content']//div[@id='results']//h3[@class='yt-lockup-title ']//a[text()='Kala Chashma | Baar Baar Dekho | Sidharth Malhotra  Katrina Kaif | Badshah Neha Kakkar Indeep Bakshi']");
	
	public final Logger logger = RootLogger.getLogger(YoutubeTest.class);
	
	
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.getTitle();
	  System.out.println("Before Class");
	  //Thread.sleep(2000);
	  logger.debug("message");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
	  driver.close();
  }

  @Test(priority=0)
  public void songSearch() throws InterruptedException {
	  driver.findElement(search).sendKeys("kala chasma");
	  //driver.findElement(search).click();
	  Thread.sleep(2000);
	  
  }
  
  @Test(priority=1)
  public void searchClick() throws InterruptedException{
	  driver.findElement(click).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=2)
  public void songSelect() throws InterruptedException{
	  driver.findElement(select).click();
	  Thread.sleep(2000);
	  
  }
}
