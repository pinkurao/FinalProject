package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class AmazonAccountCreate {
	
	WebDriver driver;
	String url ="https://www.amazon.com/";
	//By newcustomer =By.xpath("//div[@id='nav-flyout-anchor']//div[@class='nav-signin-tooltip-footer']//a[contains(text(),'Start here')]");
	By customername=By.id("ap_customer_name");
	By email = By.id("ap_email");
	By password =By.id("ap_password");
	By reenterpwd = By.id("ap_password_check");
	By createaccount = By.id("continue");
	By logoutclick = By.xpath("//div[@class='nav-right']//a[@id='nav-link-yourAccount']");
	By logout = By.xpath("//div[@id='nav-flyout-anchor']//a[@id='nav-item-signout']//span[text()='Not pavan? Sign Out']");
	By siginemail = By.id("ap_email");
	By signinpassword = By.id("ap_password");
	By signinbutton = By.id("signInSubmit");
	
  
    @BeforeClass
    public void beforeClass() throws InterruptedException {
	  driver = new FirefoxDriver();
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.getTitle();
	  System.out.println("BEFORE CLASS");
	 // Thread.sleep(2000);
  }

  @Test(priority=0,alwaysRun=true)
  public void createAccount() throws InterruptedException {
	 // driver.findElement(By.xpath("//div[@id='nav-flyout-anchor']//div[@class='nav-signin-tooltip-footer']//a[contains(text(),'Start here')]")).click();
	  //Thread.sleep(2000);
	  WebElement newcustomer = driver.findElement(By.xpath("//div[@id='nav-flyout-anchor']//div[@class='nav-signin-tooltip-footer']//a[contains(text(),'Start here')]"));
		newcustomer.click();
		Thread.sleep(2000);
	  driver.findElement(customername).sendKeys("pavan");
	  driver.findElement(email).sendKeys("pavanpinku34@gmail.com");
	  driver.findElement(password).sendKeys("pinku9160647577");
	  driver.findElement(reenterpwd).sendKeys("pinku9160647577");
	  driver.findElement(createaccount).click();
	  Thread.sleep(2000);
	}
  
  @Test(dependsOnMethods={"createAccount"},alwaysRun=true)
  public void logoutAccount(){
	  
	  Actions mouseaction = new Actions(driver);
	  WebElement we =driver.findElement(logoutclick);
	  mouseaction.moveToElement(we).build().perform();
	  
  }
  
  @Test(dependsOnMethods={"logoutAccount"},alwaysRun=true)
  public void logout() throws InterruptedException{
	  driver.findElement(logout).click();
	  Thread.sleep(2000);
  }
  
  @Test(dependsOnMethods={"logout"},alwaysRun=true)
  
  public void signIn(){
	  
	  driver.findElement(siginemail).sendKeys("pavanpinku34@gmail.com");
	  driver.findElement(signinpassword).sendKeys("pinku9160647577");
	  driver.findElement(signinbutton).click();
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS");
	  driver.close();
  }

}
